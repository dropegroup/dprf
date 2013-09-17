package br.com.dropegroup.dprf.entity;

import javax.persistence.Column;
import javax.persistence.Id;

//@Entity
//@Table(name = "tipoapreensao")
public class TipoApreensao {
	
	// o dicionario de dados coloca o tipo SERIAL
	@Id
	@Column(name = "ttpcodigo")
	private Integer ttpcodigo;

	@Column(name = "ttpatualiza")
	private Character ttpatualiza;
}
