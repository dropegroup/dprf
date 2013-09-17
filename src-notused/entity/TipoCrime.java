package br.com.dropegroup.dprf.entity;

import javax.persistence.Column;
import javax.persistence.Id;

//@Entity
//@Table(name = "tipocrime")
public class TipoCrime {

	// o dicionario de dados coloca o tipo SERIAL
	@Id
	@Column(name = "ttccodigo")
	private Integer ttccodigo;

	@Column(name = "ttcdescicao", length = 60)
	private String ttcdescicao;

	@Column(name = "ttcatualiza")
	private Character ttcatualiza;
}
