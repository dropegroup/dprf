package br.com.dropegroup.dprf.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Id;

//@Entity
//@Table(name = "ocorrenciapessoa")
public class OcorrenciaPessoa {

	@Id
	@Column(name = "opeid")
	private Integer opeid;

	@Column(name = "opeocoid")
	private Integer opeocoid;

	@Column(name = "opepesid")
	private Integer opepesid;

	@Column(name = "opeportenumero", length = 9)
	private String opeportenumero;

	@Column(name = "opeportevalidade")
	private Date opeportevalidade;

	@Column(name = "opettecodigo")
	private Integer opettecodigo;

	@Column(name = "openaoident", length = 1)
	private String openaoident;

	@Column(name = "opeestrangeiro", length = 1)
	private String opeestrangeiro;

	@Column(name = "opeanexo", length = 1)
	private String opeanexo;

	@Column(name = "opecondalegadas", length = 1)
	private String opecondalegadas;

}
