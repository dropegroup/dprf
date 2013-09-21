package br.com.dropegroup.dprf.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Cadastro dos dados do veículo.
 */
@Entity
@Table(name = "veiculo")
public class Veiculo implements Serializable {
	private static final long serialVersionUID = -6853177258138045651L;

	@Id
	@Column(name = "veiid")
	private Long id;

	@Column(name = "veiano")
	private String ano;

	@Column(name = "veidescricao")
	private String descricao;

	@Column(name = "veimunicipio")
	private String municipio;

	@Column(name = "veimunorigem")
	private String municipioOrigem;

	@Column(name = "veimundestino")
	private String municipioDestino;

	@Column(name = "veipaisorigem")
	private Integer paisOrigem;

	@Column(name = "veipaisdestino")
	private Integer paisDestino;

	@Column(name = "veioenid")
	private Integer veioenid;

	@Column(name = "veiproprietario")
	private Integer proprietario;

	@Column(name = "veitipoproprietario", length = 1)
	private String tipoProprietario;

	@Column(name = "veiqtdocupantes")
	private Integer quantidadeOcupantes;

	@Column(name = "veisequencial")
	private Integer veisequencial;

	@Column(name = "veitcecodigo")
	private Integer veitcecodigo;

	@Column(name = "veitcvcodigo")
	private Integer veitcvcodigo;

	@Column(name = "veitevcodigo")
	private Integer veitevcodigo;

	@Column(name = "veitipoplaca", length = 1)
	private String veitipoplaca;

	@Column(name = "veitmvcodigo")
	private Integer veitmvcodigo;

	@Column(name = "veitttcodigo")
	private Integer veitttcodigo;

	@Column(name = "veitvvcodigo")
	private Integer veitvvcodigo;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getMunicipio() {
		return municipio;
	}

	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}

	public String getMunicipioOrigem() {
		return municipioOrigem;
	}

	public void setMunicipioOrigem(String municipioOrigem) {
		this.municipioOrigem = municipioOrigem;
	}

	public String getMunicipioDestino() {
		return municipioDestino;
	}

	public void setMunicipioDestino(String municipioDestino) {
		this.municipioDestino = municipioDestino;
	}

	public Integer getPaisOrigem() {
		return paisOrigem;
	}

	public void setPaisOrigem(Integer paisOrigem) {
		this.paisOrigem = paisOrigem;
	}

	public Integer getPaisDestino() {
		return paisDestino;
	}

	public void setPaisDestino(Integer paisDestino) {
		this.paisDestino = paisDestino;
	}

	public Integer getVeioenid() {
		return veioenid;
	}

	public void setVeioenid(Integer veioenid) {
		this.veioenid = veioenid;
	}

	public Integer getProprietario() {
		return proprietario;
	}

	public void setProprietario(Integer proprietario) {
		this.proprietario = proprietario;
	}

	public String getTipoProprietario() {
		return tipoProprietario;
	}

	public void setTipoProprietario(String tipoProprietario) {
		this.tipoProprietario = tipoProprietario;
	}

	public Integer getQuantidadeOcupantes() {
		return quantidadeOcupantes;
	}

	public void setQuantidadeOcupantes(Integer quantidadeOcupantes) {
		this.quantidadeOcupantes = quantidadeOcupantes;
	}

	public Integer getVeisequencial() {
		return veisequencial;
	}

	public void setVeisequencial(Integer veisequencial) {
		this.veisequencial = veisequencial;
	}

	public Integer getVeitcecodigo() {
		return veitcecodigo;
	}

	public void setVeitcecodigo(Integer veitcecodigo) {
		this.veitcecodigo = veitcecodigo;
	}

	public Integer getVeitcvcodigo() {
		return veitcvcodigo;
	}

	public void setVeitcvcodigo(Integer veitcvcodigo) {
		this.veitcvcodigo = veitcvcodigo;
	}

	public Integer getVeitevcodigo() {
		return veitevcodigo;
	}

	public void setVeitevcodigo(Integer veitevcodigo) {
		this.veitevcodigo = veitevcodigo;
	}

	public String getVeitipoplaca() {
		return veitipoplaca;
	}

	public void setVeitipoplaca(String veitipoplaca) {
		this.veitipoplaca = veitipoplaca;
	}

	public Integer getVeitmvcodigo() {
		return veitmvcodigo;
	}

	public void setVeitmvcodigo(Integer veitmvcodigo) {
		this.veitmvcodigo = veitmvcodigo;
	}

	public Integer getVeitttcodigo() {
		return veitttcodigo;
	}

	public void setVeitttcodigo(Integer veitttcodigo) {
		this.veitttcodigo = veitttcodigo;
	}

	public Integer getVeitvvcodigo() {
		return veitvvcodigo;
	}

	public void setVeitvvcodigo(Integer veitvvcodigo) {
		this.veitvvcodigo = veitvvcodigo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass()) {
			return false;
		}
		Veiculo other = (Veiculo) obj;
		if (id == null) {
			if (other.id != null) {
				return false;
			}
		} else if (!id.equals(other.id)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder(getClass().getSimpleName());
		sb.append("[id=").append(id);
		sb.append("[ano=").append(descricao);
		sb.append(", descricao=").append(descricao);
		sb.append(", municipio=").append(municipio);
		sb.append(", municipioOrigem=").append(municipioOrigem);
		sb.append(", municipioDestino=").append(municipioDestino);
		sb.append(", paisOrigem=").append(paisOrigem);
		sb.append(", paisDestino=").append(paisDestino);
		sb.append(", veioenid=").append(veioenid);
		sb.append(", proprietario=").append(proprietario);
		sb.append(", tipoProprietario=").append(tipoProprietario);
		sb.append(", quantidadeOcupantes=").append(quantidadeOcupantes);
		sb.append(", veisequencial=").append(veisequencial);
		sb.append(", veitcecodigo=").append(veitcecodigo);
		sb.append(", veitcvcodigo=").append(veitcvcodigo);
		sb.append(", veitevcodigo=").append(veitevcodigo);
		sb.append(", veitipoplaca=").append(veitipoplaca);
		sb.append(", veitmvcodigo=").append(veitmvcodigo);
		sb.append(", veitttcodigo=").append(veitttcodigo);
		sb.append(", veitvvcodigo=").append(veitvvcodigo);
		return sb.toString();
	}

}
