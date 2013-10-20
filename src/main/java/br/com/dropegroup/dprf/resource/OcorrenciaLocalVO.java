package br.com.dropegroup.dprf.resource;

import java.io.Serializable;

public class OcorrenciaLocalVO implements Serializable {
    private static final long serialVersionUID = 7970249610230860008L;

    private String estado;
    private String cidade;
    private Double latitude;
    private Double longitude;
    private Integer ocorrencias;

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public Integer getOcorrencias() {
        return ocorrencias;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public void setOcorrencias(Integer ocorrencias) {
        this.ocorrencias = ocorrencias;
    }

    @Override
    public String toString() {
        return "OcorrenciaDataLocalVO [estado:" + estado + ", cidade:" + cidade + ", latitude:" + latitude + ", longitude:" + longitude
                + ", ocorrencias:" + ocorrencias + "]";
    }

}
