# Client for Lemontech's SOAP webservice.

[Lemontech](https://www.lemontech.com.br/) is a brazilian company that develops a web system for travel management. It has a SOAP based webservice with several 
methods that can be used for writing and reading data on it's database. It's doccumentation can be found on this [link](https://wsselfbooking.lemontech.com.br/wsselfbooking/docs/).

This is a Restful API built with Spring Boot, JPARepository and MySQL as database. This API was develop to receive as input a travel request number from Lemontech when it reaches
it's final stage. Once the API is requested, it then triggers a request call to Lemontech's webservice wich returns all data from the travel request, like total
travel cost, departure date, arrival, passenger etc.

This project is for study purpose only and it can still be improved in many ways.

## Example:

#### Lemontech webhook request:

```xml
<solicitacao>
	<id>701020</id>
	<tipoIntegracao>CONCLUSAO</tipoIntegracao>
</solicitacao>
```
- id = travel request number
- tipoIntegracao = stage of travel request on web system. "CONCLUSAO" means "conclusion".

#### Restful Spring Boot API and request call to Lemontech SOAP webservice:

- Endpoint: https://integracao-lemontech2.herokuapp.com/nova-solicitacao

```java
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
```



