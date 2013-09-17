package br.com.dropegroup.dprf.entity;

import javax.persistence.Column;
import javax.persistence.Id;

//@Entity
//@Table(name = "uf")
public class UF {

	@Id
	@Column(name = "tufuf", length = 2)
	private String tufuf;

	@Column(name = "tufdenominacao", length = 60)
	private String tufdenominacao;
}
