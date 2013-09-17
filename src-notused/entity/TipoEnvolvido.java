package br.com.dropegroup.dprf.entity;

import javax.persistence.Column;
import javax.persistence.Id;

//@Entity
//@Table(name = "tipoenvolvido")
public class TipoEnvolvido{
	// o dicionario de dados coloca o tipo SERIAL
	@Id
	@Column(name = "ttecodigo")
	private Integer ttecodigo;

	@Column(name = "tteatualiza")
	private Character tteatualiza;

	@Column(name = "tteativo")
	private Character tteativo;
}