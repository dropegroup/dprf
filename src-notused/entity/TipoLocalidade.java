package br.com.dropegroup.dprf.entity;

import javax.persistence.Column;
import javax.persistence.Id;

//@Entity
//@Table(name = "tipolocalidade")
public class TipoLocalidade{

	// o dicionario de dados coloca o tipo SERIAL
	@Id
	@Column(name = "ttlcodigo")
	private Integer ttlcodigo;

	@Column(name = "ttldescricao", length=60)
	private String ttldescricao;

	@Column(name = "ttlatualiza")
	private Character ttlatualiza;
	
}
