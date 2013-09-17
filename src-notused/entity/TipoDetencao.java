package br.com.dropegroup.dprf.entity;

import javax.persistence.Column;
import javax.persistence.Id;

//@Entity
//@Table(name = "tipodetencao")
public class TipoDetencao {

	// o dicionario de dados coloca o tipo SERIAL
	@Id
	@Column(name = "ttdcodigo")
	private Integer ttdcodigo;

	@Column(name = "ttdatualiza")
	private Character ttdatualiza;

}
