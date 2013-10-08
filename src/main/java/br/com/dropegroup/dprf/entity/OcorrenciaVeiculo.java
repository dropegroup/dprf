package br.com.dropegroup.dprf.entity;

import javax.persistence.Column;
import javax.persistence.Id;

//@Entity
//@Table(name = "ocorrenciaveiculo")
public class OcorrenciaVeiculo {

	@Id
	@Column(name = "ocvid")
	private Integer ocvid;

	@Column(name = "ocvocoid")
	private Integer ocvocoid;

	@Column(name = "ocvveiid")
	private Integer ocvveiid;

}
