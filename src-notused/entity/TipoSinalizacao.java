package br.com.dropegroup.dprf.entity;

import javax.persistence.Column;
import javax.persistence.Id;

//@Entity
//@Table(name = "tiposinalizacao")
public class TipoSinalizacao{

	// o dicionario de dados coloca o tipo SERIAL
	@Id
	@Column(name = "ttscodigo")
	private Integer ttscodigo;

	@Column(name = "ttsdescricao", length=60)
	private String ttsdescricao;

	@Column(name = "ttsatualiza")
	private Character ttsatualiza;

}
