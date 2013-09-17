package br.com.dropegroup.dprf.entity;

import javax.persistence.Column;
import javax.persistence.Id;

//@Entity
//@Table(name = "tipopontomedico")
public class TipoPontoMedico {

	@Id
	@Column(name = "ttmcodigo")
	private Integer ttmcodigo;

	@Column(name = "ttmdescricao", length = 60)
	private String ttmdescricao;

	@Column(name = "ttmatualiza", length = 1)
	private String ttmatualiza;
}