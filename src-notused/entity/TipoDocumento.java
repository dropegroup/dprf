package br.com.dropegroup.dprf.entity;

import javax.persistence.Column;
import javax.persistence.Id;

//@Entity
//@Table(name = "tipodocumento")
public class TipoDocumento{
	// o dicionario de dados coloca o tipo SERIAL
	@Id
	@Column(name = "ttocodigo")
	private Integer ttocodigo;

	@Column(name = "ttoatualiza")
	private Character ttoatualiza;
	
	@Column(name = "ttorelrecuperacao")
	private Character ttorelrecuperacao;
	
}
