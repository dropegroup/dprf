package br.com.dropegroup.dprf.entity;

import javax.persistence.Column;
import javax.persistence.Id;

//@Entity
//@Table(name = "tipocomunicacao")
public class TipoComunicacao {

	// o dicionario de dados coloca o tipo SERIAL
	@Id
	@Column(name = "tcocodigo")
	private Integer tcocodigo;

	@Column(name = "tcoatualiza")
	private Character tcoatualiza;
	
}