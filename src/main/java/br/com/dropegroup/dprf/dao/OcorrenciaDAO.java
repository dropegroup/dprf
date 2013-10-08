package br.com.dropegroup.dprf.dao;

import java.util.List;

import br.com.dropegroup.dprf.resource.OcorrenciaAgrupamentoVO;

public interface OcorrenciaDAO {
    /**
     * Retorna indice de ocorrencias agrupada rodovia/estado/ano/mes.
     */
    List<OcorrenciaAgrupamentoVO> find();
    /**
     * Retorna indice de ocorrencias agrupada rodovia/estado/ano/mes, filtrado por ano
    */
    List<OcorrenciaAgrupamentoVO> find(Integer ano);
    /**
     * Retorna indice de ocorrencias agrupada rodovia/estado/ano/mes, filtrado por ano/mes
     */
    List<OcorrenciaAgrupamentoVO> find(Integer ano, Integer mes);
    /**
     * Retorna indice de ocorrencias agrupada rodovia/estado/ano/mes, filtrado por estado
     */
    List<OcorrenciaAgrupamentoVO> find(String estado);
    /**
     * Retorna indice de ocorrencias agrupada rodovia/estado/ano/mes, filtrado por estado/rodovia
     */
    List<OcorrenciaAgrupamentoVO> find(String estado, String rodovia);
}
