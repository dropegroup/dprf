package br.com.dropegroup.dprf.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Id;

//@Entity
//@Table(name = "rod_acidente")
public class RodoviaAcidente {

	@Id
	@Column(name = "id_rod_acidente")
	private Integer id_rod_acidente;

	@Column(name = "tipo")
	private Integer tipo;

	@Column(name = "data_ocorrencia")
	private Timestamp data_ocorrencia;

	@Column(name = "sentido")
	private Integer sentido;

	@Column(name = "interdicao", length = 1)
	private String interdicao;

	@Column(name = "desc_interdicao")
	private String desc_interdicao;

	@Column(name = "num_feridos")
	private Integer num_feridos;

	@Column(name = "num_mortos")
	private Integer num_mortos;

	@Column(name = "num_socorridos")
	private Integer num_socorridos;

	@Column(name = "destino")
	private String destino;

	@Column(name = "resumo")
	private String resumo;

	@Column(name = "municipio", length = 5)
	private String municipio;

	@Column(name = "tcacodigo")
	private Integer tcacodigo;

	@Column(name = "ttacodigo")
	private Integer ttacodigo;

	@Column(name = "comid")
	private Integer comid;

	@Column(name = "local")
	private Integer local;

}
