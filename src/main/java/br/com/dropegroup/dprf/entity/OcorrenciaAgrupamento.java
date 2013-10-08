package br.com.dropegroup.dprf.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ocorrenciaagrup")
public class OcorrenciaAgrupamento implements Serializable {
	private static final long serialVersionUID = -554059761902494402L;

	@Id
	@Column(name = "id")
	private Long id;

	@Column(name = "localbr_id", length = 2)
	private Long idLocalBr;

	@Column(name = "estado", length = 3)
	private String estado;

	@Column(name = "municipio", length = 255)
	private String municipio;

	@Column(name = "num_ocorrencias", length = 3)
	private Integer ocorrencias;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getIdLocalBr() {
		return idLocalBr;
	}

	public void setIdLocalBr(Long idLocalBr) {
		this.idLocalBr = idLocalBr;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getMunicipio() {
		return municipio;
	}

	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}

	public Integer getOcorrencias() {
		return ocorrencias;
	}

	public void setOcorrencias(Integer ocorrencias) {
		this.ocorrencias = ocorrencias;
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
		if (getClass() != obj.getClass())
			return false;
		OcorrenciaAgrupamento other = (OcorrenciaAgrupamento) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("OcorrenciaAgrupamento [");
		sb.append("id=").append(id);
		sb.append(", idLocalBr=").append(idLocalBr);
		sb.append(", estado=").append(estado);
		sb.append(", municipio=").append(municipio);
		sb.append(", ocorrencias=").append(ocorrencias);
		return sb.toString();
	}

}
