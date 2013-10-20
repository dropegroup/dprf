package br.com.dropegroup.dprf.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "OcorrenciaLocalData")
public class OcorrenciaLocalData implements Serializable {
    private static final long serialVersionUID = -554059761902494402L;

    @EmbeddedId
    private OcorrenciaLocalDataPK id;

    @Column(name = "qtd")
    private Integer qtd;

    public OcorrenciaLocalDataPK getId() {
        return id;
    }

    public void setId(OcorrenciaLocalDataPK id) {
        this.id = id;
    }

    public Integer getQtd() {
        return qtd;
    }

    public void setQtd(Integer qtd) {
        this.qtd = qtd;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("OcorrenciaAgrupamento [");
        sb.append("id=").append(id);
        sb.append(", qtd=").append(qtd);
        return sb.toString();
    }

}
