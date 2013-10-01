package br.com.dropegroup.dprf.resource;

import java.io.Serializable;

public class OcorrenciaAgrupamentoVO implements Serializable {
    private static final long serialVersionUID = 7970249610230860008L;

    private String group;
    private Integer densidade;

    public OcorrenciaAgrupamentoVO(String group, Integer value) {
        this.group = group;
        this.densidade = value;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public Integer getDensidade() {
        return densidade;
    }

    public void setDensidade(Integer densidade) {
        this.densidade = densidade;
    }

    @Override
    public String toString() {
        return "OcorrenciaAgrupamentoVO [group=" + group + ", densidade=" + densidade + "]";
    }

}
