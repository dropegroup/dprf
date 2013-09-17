package br.com.dropegroup.dprf.entity;

import javax.persistence.Column;
import javax.persistence.Id;

//@Entity
//@Table(name = "tipoveiculo")
public class TipoVeiculo {

	// o dicionario de dados coloca o tipo SERIAL
	@Id
	@Column(name = "tvvcodigo")
	private Integer tvvcodigo;

	@Column(name = "tvvatualiza")
	private Character tvvatualiza;

	@Column(name = "tvvativo")
	private Character tvvativo;

}
