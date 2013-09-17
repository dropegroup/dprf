package br.com.dropegroup.dprf.entity;

import javax.persistence.Column;
import javax.persistence.Id;

//@Entity
//@Table(name = "unidadeoperacional")
public class UnidadeOperacional {

	@Id
	@Column(name = "uniid")
	private Integer uniid;

	@Column(name = "uniunidade", length = 6)
	private String uniunidade;

	@Column(name = "unilotacao", length = 9)
	private String unilotacao;

	@Column(name = "unisigla", length = 15)
	private String unisigla;

	@Column(name = "unittucodigo")
	private Integer unittucodigo;

	@Column(name = "tmucodigo", length = 5)
	private String tmucodigo;

	@Column(name = "uniunidaderesponsavel")
	private Integer uniunidaderesponsavel;

	@Column(name = "unidenominacao", length = 80)
	private String unidenominacao;

	@Column(name = "uniendereco", length = 60)
	private String uniendereco;

	@Column(name = "unimunicipio", length = 5)
	private String unimunicipio;

	@Column(name = "unicep", length = 8)
	private String unicep;

	@Column(name = "unitelefone", length = 250)
	private String unitelefone;

	@Column(name = "uniemail", length = 60)
	private String uniemail;

	@Column(name = "unilocal")
	private Integer unilocal;

	@Column(name = "unilatitude", length = 10)
	private String unilatitude;

	@Column(name = "unilongitude", length = 10)
	private String unilongitude;

	@Column(name = "unihelicoptero", length = 1)
	private String unihelicoptero;

	@Column(name = "unitexto", length = 255)
	private String unitexto;

}
