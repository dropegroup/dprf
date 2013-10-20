package br.com.dropegroup.dprf.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class OcorrenciaLocalDataPK implements Serializable {
    private static final long serialVersionUID = -554059761902494402L;

    @Column(name = "ano")
    private Integer ano;

    @Column(name = "mes")
    private Integer mes;

    @Column(name = "uf", length = 2)
    private String uf;

    @Column(name = "cidade", length = 100)
    private String cidade;

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public Integer getMes() {
        return mes;
    }

    public void setMes(Integer mes) {
        this.mes = mes;
    }

   
    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }


    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("OcorrenciaLocalDataPK [");
        sb.append(", ano=").append(ano);
        sb.append(", mes=").append(mes);
        sb.append(", estado=").append(uf);
        sb.append(", municipio=").append(cidade);
        return sb.toString();
    }

}
