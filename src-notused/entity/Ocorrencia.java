package br.com.dropegroup.dprf.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Id;

//@Entity
//@Table(name = "ocorrencia")
public class Ocorrencia {

	@Id
	@Column(name = "ocoid")
	private Integer ocoid;

	@Column(name = "ocolocal")
	private Integer ocolocal;

	@Column(name = "ocostatus", length = 1)
	private String ocostatus;

	@Column(name = "ocomunicipio", length = 5)
	private String ocomunicipio;

	@Column(name = "ocosentido", length = 1)
	private String ocosentido;

	@Column(name = "ocodataocorrencia")
	private Timestamp ocodataocorrencia;

	@Column(name = "ocodataregistro")
	private Timestamp ocodataregistro;

	@Column(name = "ocotipo", length = 2)
	private String ocotipo;

	@Column(name = "ococomid")
	private Integer ococomid;

	@Column(name = "ocoidorigem")
	private Integer ocoidorigem;

	@Column(name = "ococpfretif", length = 11)
	private String ococpfretif;

	@Column(name = "ocodatafim")
	private Timestamp ocodatafim;

	@Column(name = "ocoresolucao_monta", length = 10)
	private String ocoresolucao_monta;

}
