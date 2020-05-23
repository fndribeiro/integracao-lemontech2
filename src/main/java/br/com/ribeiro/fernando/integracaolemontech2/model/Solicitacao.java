package br.com.ribeiro.fernando.integracaolemontech2.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

import org.hibernate.annotations.CreationTimestamp;

@XmlRootElement
@Entity
@Table(name = "solicitacao")
public class Solicitacao {

	@Id
	private long id;

	@Column(nullable = false)
	String tipoIntegracao;

	@CreationTimestamp
	private LocalDateTime dataIntegracao;

	@Column(nullable = true)
	private String codigoRegional;

	@Column(nullable = true)
	private String codigoCentroDeCusto;

	@Column(nullable = true)
	private Double valorTotalSv;

	public Solicitacao() {

	}

	public Solicitacao(long id, String tipoIntegracao, LocalDateTime dataIntegracao) {
		this.id = id;
		this.tipoIntegracao = tipoIntegracao;
		this.dataIntegracao = dataIntegracao;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTipoIntegracao() {
		return tipoIntegracao;
	}

	public void setTipoIntegracao(String tipoIntegracao) {
		this.tipoIntegracao = tipoIntegracao;
	}

	public LocalDateTime getDataIntegracao() {
		return dataIntegracao;
	}

	public void setDataIntegracao(LocalDateTime dataIntegracao) {
		this.dataIntegracao = dataIntegracao;
	}

	public String getCodigoRegional() {
		return codigoRegional;
	}

	public void setCodigoRegional(String codigoRegional) {
		this.codigoRegional = codigoRegional;
	}

	public String getCodigoCentroDeCusto() {
		return codigoCentroDeCusto;
	}

	public void setCodigoCentroDeCusto(String codigoCentroDeCusto) {
		this.codigoCentroDeCusto = codigoCentroDeCusto;
	}

	public Double getValorTotalSv() {
		return valorTotalSv;
	}

	public void setValorTotalSv(Double valorTotalSv) {
		this.valorTotalSv = valorTotalSv;
	}	
}
