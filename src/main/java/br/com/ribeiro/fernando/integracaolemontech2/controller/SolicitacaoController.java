package br.com.ribeiro.fernando.integracaolemontech2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.ribeiro.fernando.integracaolemontech2.model.Solicitacao;
import br.com.ribeiro.fernando.integracaolemontech2.repository.SolicitacaoRepository;

@RestController
@RequestMapping(value = "/nova-solicitacao")
public class SolicitacaoController {

	@Autowired
	private SolicitacaoRepository repositorio;
	
	@PostMapping
	public Solicitacao novaSolicitacao(@RequestBody Solicitacao solicitacao) {
		
		return repositorio.save(solicitacao);
	}
}
