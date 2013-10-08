package br.com.dropegroup.dprf.entity;

import javax.persistence.Column;
import javax.persistence.Id;

//@Entity
//@Table(name = "ocorrenciaacidente")
public class OcorrenciaAcidente {

	@Id
	@Column(name = "oacocoid")
	private Integer oacocoid;

	@Column(name = "oacttacodigo")
	private Integer oacttacodigo;

	@Column(name = "oactcacodigo")
	private Integer oactcacodigo;

	@Column(name = "oacdano", length = 1)
	private String oacdano;

	@Column(name = "oacdanoterc", length = 1)
	private String oacdanoterc;

	@Column(name = "oacdanoamb", length = 1)
	private String oacdanoamb;

	@Column(name = "oaclatitude", length = 20)
	private String oaclatitude;

	@Column(name = "oaclongitude", length = 20)
	private String oaclongitude;

	@Column(name = "oacrefera", length = 60)
	private String oacrefera;

	@Column(name = "oacreferb", length = 60)
	private String oacreferb;

	@Column(name = "oacdistab")
	private Integer oacdistab;

	@Column(name = "oacdistac")
	private Integer oacdistac;

	@Column(name = "oacdistbc")
	private Integer oacdistbc;

	@Column(name = "oacmodelopista", length = 2)
	private String oacmodelopista;

	@Column(name = "oacsentido1", length = 40)
	private String oacsentido1;

	@Column(name = "oacsentido2", length = 40)
	private String oacsentido2;

	@Column(name = "oacqtdfaixa1")
	private Integer oacqtdfaixa1;

	@Column(name = "oacqtdfaixa2")
	private Integer oacqtdfaixa2;

	@Column(name = "oacacostamento1", length = 1)
	private String oacacostamento1;

	@Column(name = "oacacostamento2", length = 1)
	private String oacacostamento2;

	@Column(name = "oacimagemlen")
	private Integer oacimagemlen;

	@Column(name = "oacimagem")
	private Byte oacimagem;

	@Column(name = "oacdescdanopat", length = 255)
	private String oacdescdanopat;

	@Column(name = "oacdescdanoterc", length = 255)
	private String oacdescdanoterc;

	@Column(name = "oacdescdanoamb", length = 255)
	private String oacdescdanoamb;

	@Column(name = "oaccanteiro", length = 1)
	private String oaccanteiro;

	@Column(name = "oaclinhacentral")
	private Integer oaclinhacentral;

	@Column(name = "oacorientpista", length = 1)
	private String oacorientpista;

	@Column(name = "oacgirafundo", length = 1)
	private String oacgirafundo;

	@Column(name = "oacversaocroqui", length = 1)
	private String oacversaocroqui;

	@Column(name = "oacsitio")
	private Integer oacsitio;
}
