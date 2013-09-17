package br.com.dropegroup.dprf.entity;

import javax.persistence.Column;
import javax.persistence.Id;

//@Entity
//@Table(name = "tipoobra")
public class TipoObra {

	// o dicionario de dados coloca o tipo SERIAL
	@Id
	@Column(name = "ttbcodigo")
	private Integer ttbcodigo;

	@Column(name = "ttbdescricao", length = 60)
	private String ttbdescricao;

	@Column(name = "ttbatualiza")
	private Character ttbatualiza;
}
