package br.com.dropegroup.dprf.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "rodovia_extensao")
public class RodoviaExtensao implements Serializable {
	private static final long serialVersionUID = -8985095708005375366L;

	@Id
	@Column(name = "id")
	private Long id;

	@Column(name = "localbr_id")
	private Long idLocalBr;

	@Column(name = "extensao")
	private Float extensao;

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

	public Float getExtensao() {
		return extensao;
	}

	public void setExtensao(Float extensao) {
		this.extensao = extensao;
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
		RodoviaExtensao other = (RodoviaExtensao) obj;
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
		sb.append(", extensao=").append(extensao);
		return sb.toString();
	}

}
