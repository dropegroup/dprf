package br.com.dropegroup.dprf.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "localbr")
public class LocalBR implements Serializable {
	private static final long serialVersionUID = -8089932160358295791L;

	@Id
	@Column(name = "lbrid")
	private Integer id;

	/**
	 * Identifica a UF da ocorrência.
	 */
	@Column(name = "lbruf", length = 2)
	private String uf;

	/**
	 * Identifica a BR da Ocorrencia
	 */
	@Column(name = "lbrbr", length = 3)
	private String br;

	/**
	 * Identifica o Km da ocorrência
	 */
	@Column(name = "lbrkm", length = 5)
	private String km;

	/**
	 * Identifica a Latitude da ocorrência
	 */
	@Column(name = "lbrlatitude", length = 20)
	private String latitude;

	/**
	 * Identifica a Longitude da ocorrência
	 */
	@Column(name = "lbrlongitude", length = 20)
	private String longitude;

	@Column(name = "lbrpnvid")
	private Integer lbrpnvid;

	/**
	 * Atualização do Local da ocorrência
	 */
	@Column(name = "lbratualiza", length = 1)
	private String atualizacao;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public String getBr() {
		return br;
	}

	public void setBr(String br) {
		this.br = br;
	}

	public String getKm() {
		return km;
	}

	public void setKm(String km) {
		this.km = km;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public Integer getLbrpnvid() {
		return lbrpnvid;
	}

	public void setLbrpnvid(Integer lbrpnvid) {
		this.lbrpnvid = lbrpnvid;
	}

	public String getAtualizacao() {
		return atualizacao;
	}

	public void setAtualizacao(String atualizacao) {
		this.atualizacao = atualizacao;
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
		LocalBR other = (LocalBR) obj;
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
		StringBuilder sb = new StringBuilder("LocalBR [");
		sb.append("id=").append(id);
		sb.append(", uf=").append(uf);
		sb.append(", br=").append(br);
		sb.append(", km=").append(km);
		sb.append(", latitude=").append(latitude);
		sb.append(", longitude=").append(longitude);
		sb.append(", lbrpnvid=").append(lbrpnvid);
		sb.append(", atualizacao=").append(atualizacao);
		return sb.toString();
	}

}
