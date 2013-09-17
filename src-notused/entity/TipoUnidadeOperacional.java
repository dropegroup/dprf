package br.com.dropegroup.dprf.entity;

import javax.persistence.Column;
import javax.persistence.Id;

//@Entity
//@Table(name = "tipounidadeoperacional")
public class TipoUnidadeOperacional {

	@Id
	@Column(name = "ttucodigo")
	private Integer ttucodigo;

	@Column(name = "ttudescricao", length = 60)
	private String ttudescricao;

	@Column(name = "ttuatualiza", length = 1)
	private String ttuatualiza;

}