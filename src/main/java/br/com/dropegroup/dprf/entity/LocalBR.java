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
	private Integer lbrid;

	@Column(name = "lbruf", length = 2)
	private String lbruf;

	@Column(name = "lbrbr", length = 3)
	private String lbrbr;

	@Column(name = "lbrkm", length = 5)
	private String lbrkm;

	@Column(name = "lbrlatitude", length = 20)
	private String lbrlatitude;

	@Column(name = "lbrlongitude", length = 20)
	private String lbrlongitude;

	@Column(name = "lbrpnvid")
	private Integer lbrpnvid;

	@Column(name = "lbratualiza", length = 1)
	private String lbratualiza;

	public Integer getLbrid() {
		return lbrid;
	}

	public String getLbruf() {
		return lbruf;
	}

	public String getLbrbr() {
		return lbrbr;
	}

	public String getLbrkm() {
		return lbrkm;
	}

	public String getLbrlatitude() {
		return lbrlatitude;
	}

	public String getLbrlongitude() {
		return lbrlongitude;
	}

	public Integer getLbrpnvid() {
		return lbrpnvid;
	}

	public String getLbratualiza() {
		return lbratualiza;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("LocalBR [");
		sb.append("lbrid=").append(lbrid);
		sb.append(", lbruf=").append(lbruf);
		sb.append(", lbrbr=").append(lbrbr);
		sb.append(", lbrkm=").append(lbrkm);
		sb.append(", lbrlatitude=").append(lbrlatitude);
		sb.append(", lbrlongitude=").append(lbrlongitude);
		sb.append(", lbrpnvid=").append(lbrpnvid);
		sb.append(", lbratualiza=").append(lbratualiza);
		return sb.toString();
	}

	
}
