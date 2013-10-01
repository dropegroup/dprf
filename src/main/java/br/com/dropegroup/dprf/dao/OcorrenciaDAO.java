package br.com.dropegroup.dprf.dao;

import java.util.List;

import br.com.dropegroup.dprf.resource.OcorrenciaAgrupamentoVO;

public interface OcorrenciaDAO {

    /**
     * Retorna quantidade de ocorrencias agrupada por rodovias.
     */
    List<OcorrenciaAgrupamentoVO> find();

    /**
     * Retorna quantidade de ocorrencias de uma rodovia agrupadas por estado.
     */
    List<OcorrenciaAgrupamentoVO> find(Integer rodovia);

    /**
     * Retorna quantidade de ocorrencias de uma rodovia e de um estado agrupadas por municipio.
     */
    List<OcorrenciaAgrupamentoVO> find(Integer rodovia, String estado);

}
