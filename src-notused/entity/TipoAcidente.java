package br.com.dropegroup.dprf.entity;

import javax.persistence.Column;
import javax.persistence.Id;

//@Entity
//@Table(name = "tipoacidente")
public class TipoAcidente {

	@Id
	@Column(name = "ttacodigo")
	private Integer ttacodigo;

	@Column(name = "ttaatualiza", length = 1)
	private String ttaatualiza;

	@Column(name = "ttaativo", length = 1)
	private String ttaativo;
}