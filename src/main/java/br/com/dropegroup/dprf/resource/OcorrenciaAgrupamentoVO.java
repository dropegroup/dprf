package br.com.dropegroup.dprf.resource;

import java.io.Serializable;

public class OcorrenciaAgrupamentoVO implements Serializable {
    private static final long serialVersionUID = 7970249610230860008L;

    private String rodovia;
    private String estado;
    private Integer ano;
    private Integer mes;
    private Double indice;

//    Construtor vazio gerado automaticamente
//    public OcorrenciaAgrupamentoVO() {
//    }

    @Override
    public String toString() {
        return "OcorrenciaAgrupamentoVO [rodovia=" + getRodovia() + ",estado=" + getEstado() + ",ano" + getAno() + ",mes" + getMes() + ",indice" + getIndice() + "]";
    }

    /**
     * @return the rodovia
     */
    public String getRodovia() {
        return rodovia;
    }

    /**
     * @param rodovia the rodovia to set
     */
    public void setRodovia(String rodovia) {
        this.rodovia = rodovia;
    }

    /**
     * @return the estado
     */
    public String getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }

    /**
     * @return the ano
     */
    public Integer getAno() {
        return ano;
    }

    /**
     * @param ano the ano to set
     */
    public void setAno(Integer ano) {
        this.ano = ano;
    }

    /**
     * @return the mes
     */
    public Integer getMes() {
        return mes;
    }

    /**
     * @param mes the mes to set
     */
    public void setMes(Integer mes) {
        this.mes = mes;
    }

    /**
     * @return the indice
     */
    public Double getIndice() {
        return indice;
    }

    /**
     * @param indice the indice to set
     */
    public void setIndice(Double indice) {
        this.indice = indice;
    }

}
