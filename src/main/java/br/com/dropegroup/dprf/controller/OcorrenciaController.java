/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.dropegroup.dprf.controller;

import br.com.dropegroup.dprf.component.OcorrenciaComponent;
import br.com.dropegroup.dprf.resource.OcorrenciaAgrupamentoVO;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author dailton.almeida
 */
@Service
@RequestMapping("/")
public class OcorrenciaController {
    @Autowired
    private OcorrenciaComponent ocorrenciaComponent;

    /**
     * Retorna o indice de acidentes de todas as rodovias/estado/ano, em formato JSON
     * Exemplo: [{rodovia: "BR-999", estado: "SP", ano: 2010, indice: 1.56},{},...,{}]
     * @return Lista de objetos da classe OcorrenciaAgrupamentoVO, com alvo para ser convertida para JSON
     */
    @RequestMapping(value = "/ocorrencias/ranking", method = RequestMethod.GET, produces = "application/json")
    @ResponseBody
    public List<OcorrenciaAgrupamentoVO> getRankingOcorrenciasAsJSON() {
        return ocorrenciaComponent.buscaRankingRodovia();
    }

    /**
     * Retorna o indice de acidentes de todas as rodovias/estado/ano, filtrado por ano, em formato JSON
     * Exemplo: [{rodovia: "BR-999", estado: "SP", ano: 2010, indice: 1.56},{},...,{}]
     * @param ano
     * @return Lista de objetos da classe OcorrenciaAgrupamentoVO, com alvo para ser convertida para JSON
     */
    @RequestMapping(value = "/ocorrencias/ranking/{ano}", method = RequestMethod.GET, produces = "application/json")
    @ResponseBody
    public List<OcorrenciaAgrupamentoVO> getRankingRodoviasAnoAsJSON(@PathVariable Integer ano) {
        return ocorrenciaComponent.buscaRankingRodovia(ano);
    }

    /**
     * Retorna o indice de acidentes de todas as rodovias/estado/ano, filtrado por ano e mes, em formato JSON
     * Exemplo: [{rodovia: "BR-999", estado: "SP", ano: 2010, indice: 1.56},{},...,{}]
     * @param ano
     * @return Lista de objetos da classe OcorrenciaAgrupamentoVO, com alvo para ser convertida para JSON
     */
    @RequestMapping(value = "/ocorrencias/ranking/{ano}/{mes}", method = RequestMethod.GET, produces = "application/json")
    @ResponseBody
    public List<OcorrenciaAgrupamentoVO> getRankingRodoviasAnoAsJSON(
            @PathVariable(value="ano") Integer ano,
            @PathVariable(value="mes") Integer mes) {
        return ocorrenciaComponent.buscaRankingRodovia(ano, mes);
    }

    /**
     * Retorna o indice de acidentes de todas as rodovias/estado/ano, filtrado por estado, em formato JSON
     * Exemplo: [{rodovia: "BR-999", estado: "SP", ano: 2010, indice: 1.56},{},...,{}]
     * @param ano
     * @return Lista de objetos da classe OcorrenciaAgrupamentoVO, com alvo para ser convertida para JSON
     */
    @RequestMapping(value = "/ocorrencias/ranking/estado/{estado}", method = RequestMethod.GET, produces = "application/json")
    @ResponseBody
    public List<OcorrenciaAgrupamentoVO> getRankingRodoviasEstadoRodoviaAsJSON(
            @PathVariable(value="estado") String estado) {
        return ocorrenciaComponent.buscaRankingRodovia(estado);
    }
    
    /**
     * Retorna o indice de acidentes de todas as rodovias/estado/ano, filtrado por estado e rodovia, em formato JSON
     * Exemplo: [{rodovia: "BR-999", estado: "SP", ano: 2010, indice: 1.56},{},...,{}]
     * @param ano
     * @return Lista de objetos da classe OcorrenciaAgrupamentoVO, com alvo para ser convertida para JSON
     */
    @RequestMapping(value = "/ocorrencias/ranking/estado/{estado}/{rodovia}", method = RequestMethod.GET, produces = "application/json")
    @ResponseBody
    public List<OcorrenciaAgrupamentoVO> getRankingRodoviasEstadoRodoviaAsJSON(
            @PathVariable(value="estado") String estado,
            @PathVariable(value="rodovia") String rodovia) {
        return ocorrenciaComponent.buscaRankingRodovia(estado, rodovia);
    }
    
}
