package br.com.dropegroup.dprf.entity;

import javax.persistence.Column;
import javax.persistence.Id;

//@Entity
//@Table(name = "veiculo")
public class Veiculo {

	@Id
	@Column(name = "veiid")
	private Integer veiid;

	@Column(name = "veiano", length = 4)
	private String veiano;

	@Column(name = "veiqtdocupantes")
	private Integer veiqtdocupantes;

	@Column(name = "veitevcodigo")
	private Integer veitevcodigo;

	@Column(name = "veitcvcodigo")
	private Integer veitcvcodigo;

	@Column(name = "veitvvcodigo")
	private Integer veitvvcodigo;

	@Column(name = "veimunicipio", length = 5)
	private String veimunicipio;

	@Column(name = "veitcecodigo")
	private Integer veitcecodigo;

	@Column(name = "veimunorigem", length = 5)
	private String veimunorigem;

	@Column(name = "veipaisorigem")
	private Integer veipaisorigem;

	@Column(name = "veimundestino", length = 5)
	private String veimundestino;

	@Column(name = "veipaisdestino")
	private Integer veipaisdestino;

	@Column(name = "veitttcodigo")
	private Integer veitttcodigo;

	@Column(name = "veitipoproprietario", length = 1)
	private String veitipoproprietario;

	@Column(name = "veiproprietario")
	private Integer veiproprietario;

	@Column(name = "veioenid")
	private Integer veioenid;

	@Column(name = "veisequencial")
	private Integer veisequencial;

	@Column(name = "veitipoplaca", length = 1)
	private String veitipoplaca;

}
