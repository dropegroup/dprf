package br.com.dropegroup.dprf.entity;

import javax.persistence.Column;
import javax.persistence.Id;

//@Entity
//@Table(name = "tipopontonotavel")
public class TipoPontoNotavel {

	// o dicionario de dados coloca o tipo SERIAL
	@Id
	@Column(name = "ttncodigo")
	private Integer ttncodigo;

	@Column(name = "ttndescricao", length = 60)
	private String ttndescricao;

	@Column(name = "ttnatualiza")
	private Character ttnatualiza;

}