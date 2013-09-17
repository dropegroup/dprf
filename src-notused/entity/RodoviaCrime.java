package br.com.dropegroup.dprf.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Id;

//@Entity
//@Table(name = "rod_crime")
public class RodoviaCrime {

	@Id
	@Column(name = "id_rod_crime")
	private Integer id_rod_crime;

	@Column(name = "fk_id_comunicacao")
	private Integer fk_id_comunicacao;

	@Column(name = "fk_id_cidade")
	private Integer fk_id_cidade;

	@Column(name = "fk_id_localbr")
	private Integer fk_id_localbr;

	@Column(name = "fk_id_unidade_operacional")
	private Integer fk_id_unidade_operacional;

	@Column(name = "fk_id_servidor")
	private Integer fk_id_servidor;

	@Column(name = "fora_rodovia")
	private Boolean fora_rodovia;

	@Column(name = "interdicao_rodovia")
	private Boolean interdicao_rodovia;

	@Column(name = "numero_mortos")
	private Integer numero_mortos;

	@Column(name = "numero_pessoas_socorridas")
	private Integer numero_pessoas_socorridas;

	@Column(name = "numero_criancas_vitimas")
	private Integer numero_criancas_vitimas;

	@Column(name = "numero_criancas_infratoras")
	private Integer numero_criancas_infratoras;

	@Column(name = "numero_vitimas")
	private Integer numero_vitimas;

	@Column(name = "numero_autores")
	private Integer numero_autores;

	@Column(name = "intervencao_prf")
	private Boolean intervencao_prf;

	@Column(name = "data_hora_ocorrencia")
	private Timestamp data_hora_ocorrencia;

	@Column(name = "localizacao", length = 30)
	private String localizacao;

	@Column(name = "motivo_fora_rodovia")
	private Integer motivo_fora_rodovia;

	@Column(name = "sentido_via")
	private Integer sentido_via;

	@Column(name = "destino_vitimas")
	private String destino_vitimas;

}
