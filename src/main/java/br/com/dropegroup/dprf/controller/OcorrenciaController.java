/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.dropegroup.dprf.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.dropegroup.dprf.component.OcorrenciaComponent;

/**
 * 
 * @author dailton.almeida
 */
@Service
@RequestMapping("/")
public class OcorrenciaController {
    @Autowired
    private ControllerUtils controllerUtils;
    @Autowired
    private OcorrenciaComponent ocorrenciaComponent;

    // /**
    // * Retorna o indice de acidentes de todas as rodovias/estado/ano, em formato JSON Exemplo: [{rodovia: "BR-999",
    // estado: "SP", ano: 2010,
    // * indice: 1.56},{},...,{}]
    // *
    // * @return Lista de objetos da classe OcorrenciaAgrupamentoVO, com alvo para ser convertida para JSON
    // */
    // @RequestMapping(value = "/ocorrencias/ranking", method = RequestMethod.GET, produces = "application/json")
    // @ResponseBody
    // public ResponseEntity getRankingOcorrenciasAsJSON() {
    // try {
    // return controllerUtils.toResponseEntity(ocorrenciaComponent.buscaRankingRodovia());
    // } catch (Exception e) {
    // return controllerUtils.toResponseEntity(e);
    // }
    // }

    /**
     * Retorna o indice de acidentes de todas as rodovias/estado/ano, filtrado por ano, em formato JSON Exemplo:
     * [{rodovia: "BR-999", estado: "SP", ano: 2010, indice: 1.56},{},...,{}]
     * 
     * @param ano
     * @return Lista de objetos da classe OcorrenciaAgrupamentoVO, com alvo para ser convertida para JSON
     */
    @SuppressWarnings("rawtypes")
    @RequestMapping(value = "/ocorrencias/ranking/{ano}", method = RequestMethod.GET, produces = "application/json")
    @ResponseBody
    public ResponseEntity getRankingRodoviasAnoAsJSON(@PathVariable Integer ano) {
        try {
            return controllerUtils.toResponseEntity(ocorrenciaComponent.buscaRankingRodovia(ano));
        } catch (Exception e) {
            return controllerUtils.toResponseEntity(e);
        }
    }

    /**
     * Retorna o indice de acidentes de todas as rodovias/estado/ano, filtrado por ano e mes, em formato JSON Exemplo:
     * [{rodovia: "BR-999", estado: "SP", ano: 2010, indice: 1.56},{},...,{}]
     * 
     * @param ano
     * @return Lista de objetos da classe OcorrenciaAgrupamentoVO, com alvo para ser convertida para JSON
     */
    @SuppressWarnings("rawtypes")
    @RequestMapping(value = "/ocorrencias/ranking/{ano}/{mes}", method = RequestMethod.GET, produces = "application/json")
    @ResponseBody
    public ResponseEntity getRankingRodoviasAnoAsJSON(@PathVariable(value = "ano") Integer ano,
            @PathVariable(value = "mes") Integer mes) {
        try {
            return controllerUtils.toResponseEntity(ocorrenciaComponent.buscaRankingRodovia(ano, mes));
        } catch (Exception e) {
            return controllerUtils.toResponseEntity(e);
        }
    }

    /**
     * Retorna o indice de acidentes de todas as rodovias/estado/ano, filtrado por estado, em formato JSON Exemplo:
     * [{rodovia: "BR-999", estado: "SP", ano: 2010, indice: 1.56},{},...,{}]
     * 
     * @param ano
     * @return Lista de objetos da classe OcorrenciaAgrupamentoVO, com alvo para ser convertida para JSON
     */
//    @SuppressWarnings("rawtypes")
//    @RequestMapping(value = "/ocorrencias/ranking/estado/{estado}", method = RequestMethod.GET, produces = "application/json")
//    @ResponseBody
//    public ResponseEntity getRankingRodoviasEstadoRodoviaAsJSON(@PathVariable(value = "estado") String estado) {
//        try {
//            return controllerUtils.toResponseEntity(ocorrenciaComponent.buscaRankingRodovia(estado));
//        } catch (Exception e) {
//            return controllerUtils.toResponseEntity(e);
//        }
//    }

    /**
     * Retorna o indice de acidentes de todas as rodovias/estado/ano, filtrado por estado e rodovia, em formato JSON
     * Exemplo: [{rodovia: "BR-999", estado: "SP", ano: 2010, indice: 1.56},{},...,{}]
     * 
     * @param ano
     * @return Lista de objetos da classe OcorrenciaAgrupamentoVO, com alvo para ser convertida para JSON
     */
    @SuppressWarnings("rawtypes")
    @RequestMapping(value = "/ocorrencias/ranking/estado/{estado}/{rodovia}", method = RequestMethod.GET, produces = "application/json")
    @ResponseBody
    public ResponseEntity getRankingRodoviasEstadoRodoviaAsJSON(@PathVariable(value = "estado") String estado,
            @PathVariable(value = "rodovia") String rodovia) {
        try {
            return controllerUtils.toResponseEntity(ocorrenciaComponent.buscaRankingRodovia(estado, rodovia));
        } catch (Exception e) {
            return controllerUtils.toResponseEntity(e);
        }
    }

    // /////////////////////

    @SuppressWarnings("rawtypes")
    @RequestMapping(value = "/ocorrencias/ranking/estado/{estado}/cidade/{cidade}/ano/{ano}/mes/{mes}", method = RequestMethod.GET, produces = "application/json")
    @ResponseBody
    public ResponseEntity getRankingOcorrenciasEstadoCidadeAsJSON(@PathVariable(value = "estado") String estado,
            @PathVariable(value = "cidade") String cidade, @PathVariable(value = "ano") Integer ano,
            @PathVariable(value = "mes") Integer mes) {
        try {
            return controllerUtils.toResponseEntity(ocorrenciaComponent.buscaRankingOcorrencias(ano, mes, estado,
                    cidade));
        } catch (Exception e) {
            return controllerUtils.toResponseEntity(e);
        }
    }

    @SuppressWarnings("rawtypes")
    @RequestMapping(value = "/ocorrencias/ranking/estado/{estado}/ano/{ano}/mes/{mes}", method = RequestMethod.GET, produces = "application/json")
    @ResponseBody
    public ResponseEntity getRankingOcorrenciasEstadosAsJSON(@PathVariable(value = "estado") String estado,
            @PathVariable(value = "ano") Integer ano, @PathVariable(value = "mes") Integer mes) {
        // Combos: estado (XXXX) ano (XXXX) mes (XXXXXX) -> (estado, ano, mes)
        try {
            return controllerUtils.toResponseEntity(ocorrenciaComponent.buscaRankingOcorrencias(ano, mes, estado));
        } catch (Exception e) {
            return controllerUtils.toResponseEntity(e);
        }
    }

    @SuppressWarnings("rawtypes")
    @RequestMapping(value = "/ocorrencias/ranking/", method = RequestMethod.GET, produces = "application/json")
    @ResponseBody
    public ResponseEntity getRankingOcorrenciasAsJSON() {
        // Combos: estado (TODOS) ano (TODOS) mes (TODOS) -> ()
        try {
            return controllerUtils.toResponseEntity(ocorrenciaComponent.buscaRankingOcorrencias());
        } catch (Exception e) {
            return controllerUtils.toResponseEntity(e);
        }
    }

    @SuppressWarnings("rawtypes")
    @RequestMapping(value = "/ocorrencias/ranking/estado/{estado}", method = RequestMethod.GET, produces = "application/json")
    @ResponseBody
    public ResponseEntity getRankingOcorrenciasAsJSON(@PathVariable(value = "estado") String estado) {
        // Combos: estado (XXXX) ano (TODOS) mes (TODOS) -> (estado)
        try {
            return controllerUtils.toResponseEntity(ocorrenciaComponent.buscaRankingOcorrenciasEstado(estado));
        } catch (Exception e) {
            return controllerUtils.toResponseEntity(e);
        }
    }

    @SuppressWarnings("rawtypes")
    @RequestMapping(value = "/ocorrencias/ranking/ano/{ano}", method = RequestMethod.GET, produces = "application/json")
    @ResponseBody
    public ResponseEntity getRankingOcorrenciasAnoAsJSON(@PathVariable(value = "ano") Integer ano) {
        // Combos: estado (TODOS) ano (XXXXX) mes (TODOS) -> (ano)
        try {
            return controllerUtils.toResponseEntity(ocorrenciaComponent.buscaRankingOcorrenciasAno(ano));
        } catch (Exception e) {
            return controllerUtils.toResponseEntity(e);
        }
    }

    @SuppressWarnings("rawtypes")
    @RequestMapping(value = "/ocorrencias/ranking/mes/{mes}", method = RequestMethod.GET, produces = "application/json")
    @ResponseBody
    public ResponseEntity getRankingOcorrenciasMesAsJSON(@PathVariable(value = "mes") Integer mes) {
        // Combos: estado (TODOS) ano (TODOS) mes (XXXXXX) - > (mes)
        try {
            return controllerUtils.toResponseEntity(ocorrenciaComponent.buscaRankingOcorrenciasMes(mes));
        } catch (Exception e) {
            return controllerUtils.toResponseEntity(e);
        }
    }

    @SuppressWarnings("rawtypes")
    @RequestMapping(value = "/ocorrencias/ranking/ano/{ano}/mes/{mes}", method = RequestMethod.GET, produces = "application/json")
    @ResponseBody
    public ResponseEntity getRankingOcorrenciasAnoMesAsJSON(@PathVariable(value = "ano") Integer ano,
            @PathVariable(value = "mes") Integer mes) {
        // Combos: estado (TODOS) ano (XXXX) mes (XXXXXX) -> (ano, mes)
        try {
            return controllerUtils.toResponseEntity(ocorrenciaComponent.buscaRankingOcorrenciasAnoMes(ano, mes));
        } catch (Exception e) {
            return controllerUtils.toResponseEntity(e);
        }
    }

    @SuppressWarnings("rawtypes")
    @RequestMapping(value = "/ocorrencias/ranking/estado/{estado}/mes/{mes}", method = RequestMethod.GET, produces = "application/json")
    @ResponseBody
    public ResponseEntity getRankingOcorrenciasEstadoMesAsJSON(@PathVariable(value = "estado") String estado,
            @PathVariable(value = "mes") Integer mes) {
        // Combos: estado (XXXX) ano (TODOS) mes (XXXX) -> (estado, mes)
        try {
            return controllerUtils.toResponseEntity(ocorrenciaComponent.buscaRankingOcorrenciasEstadoMes(estado, mes));
        } catch (Exception e) {
            return controllerUtils.toResponseEntity(e);
        }
    }

    @SuppressWarnings("rawtypes")
    @RequestMapping(value = "/ocorrencias/ranking/estado/{estado}/ano/{ano}", method = RequestMethod.GET, produces = "application/json")
    @ResponseBody
    public ResponseEntity getRankingOcorrenciasEstadoAnoAsJSON(@PathVariable(value = "estado") String estado,
            @PathVariable(value = "ano") Integer ano) {
        // Combos: estado (XXXX) ano (XXXX) mes (TODOS) -> (estado, ano)
        try {
            return controllerUtils.toResponseEntity(ocorrenciaComponent.buscaRankingOcorrenciasEstadoAno(estado, ano));
        } catch (Exception e) {
            return controllerUtils.toResponseEntity(e);
        }
    }

}
