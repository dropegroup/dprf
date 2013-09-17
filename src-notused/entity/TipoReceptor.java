package br.com.dropegroup.dprf.entity;

import javax.persistence.Column;
import javax.persistence.Id;

//@Entity
//@Table(name = "tiporeceptor")
public class TipoReceptor{

	// o dicionario de dados coloca o tipo SERIAL
	@Id
	@Column(name = "ttrcodigo")
	private Integer ttrcodigo;

	@Column(name = "ttratualiza")
	private Character ttratualiza;

	@Column(name = "ttrdelegacia")
	private Character ttrdelegacia;
	
}
