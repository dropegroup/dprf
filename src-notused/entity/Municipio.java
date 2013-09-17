package br.com.dropegroup.dprf.entity;

import javax.persistence.Column;
import javax.persistence.Id;

//@Entity
//@Table(name = "Municipio")
public class Municipio {

	@Id
	@Column(name = "tmucodigo", length = 5)
	private String tmucodigo;

	@Column(name = "tmudenominacao", length = 60)
	private String tmudenominacao;

	@Column(name = "tmuuf", length = 2)
	private String tmuuf;

	@Column(name = "tmuatualiza", length = 1)
	private String tmuatualiza;

}