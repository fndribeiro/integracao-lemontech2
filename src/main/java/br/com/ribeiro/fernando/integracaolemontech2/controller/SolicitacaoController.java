package br.com.ribeiro.fernando.integracaolemontech2.controller;

import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.lemontech.selfbooking.wsselfbooking.services.WsSelfBooking;
import br.com.lemontech.selfbooking.wsselfbooking.services.WsSelfBookingServiceLocator;
import br.com.lemontech.selfbooking.wsselfbooking.services.request.PesquisarSolicitacaoRequest;
import br.com.lemontech.selfbooking.wsselfbooking.services.response.PesquisarSolicitacaoResponse;
import br.com.ribeiro.fernando.integracaolemontech2.config.CredenciaisDeAcessoWsLemon;
import br.com.ribeiro.fernando.integracaolemontech2.model.Solicitacao;
import br.com.ribeiro.fernando.integracaolemontech2.repository.SolicitacaoRepository;

@RestController
@RequestMapping(value = "/nova-solicitacao")
public class SolicitacaoController {

	@Autowired
	private SolicitacaoRepository repositorio;

	@PostMapping
	public Solicitacao novaSolicitacao(@RequestBody Solicitacao solicitacao) throws ServiceException, RemoteException {

		WsSelfBooking client = new WsSelfBookingServiceLocator().getWsSelfBookingPort();
		PesquisarSolicitacaoRequest request = new PesquisarSolicitacaoRequest();
		
		request.setIdSolicitacaoRef((int) solicitacao.getId());

		PesquisarSolicitacaoResponse response = client.pesquisarSolicitacao(CredenciaisDeAcessoWsLemon.keyClient, CredenciaisDeAcessoWsLemon.userName,
				CredenciaisDeAcessoWsLemon.userPassword, request);

		br.com.lemontech.selfbooking.wsselfbooking.beans.Solicitacao[] arraySolicitacao = response.getSolicitacao();

		for (br.com.lemontech.selfbooking.wsselfbooking.beans.Solicitacao solicitacaoResponse : arraySolicitacao) {

			solicitacao.setCodigoRegional(solicitacaoResponse.getCodRegional());
			solicitacao.setCodigoCentroDeCusto(solicitacaoResponse.getCentroDeCusto());
			solicitacao.setValorTotalSv(solicitacaoResponse.getTotais().getTotalSolicitacao());
		}

		return repositorio.save(solicitacao);
	}
}
