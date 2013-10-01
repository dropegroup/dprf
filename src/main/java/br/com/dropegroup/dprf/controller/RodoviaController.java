package br.com.dropegroup.dprf.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.dropegroup.dprf.component.RodoviaComponent;
import br.com.dropegroup.dprf.resource.OcorrenciaAgrupamentoVO;
import br.com.dropegroup.dprf.resource.Rodovia;

@Service
@RequestMapping("/")
public class RodoviaController {
    @Autowired
    private RodoviaComponent rodoviaComponent;

    @RequestMapping(value = "/rodovias", method = RequestMethod.GET, produces = "application/json")
    @ResponseBody
    public List<Rodovia> getAllRodoviasAsJSON() {
        return new ArrayList<Rodovia>(rodoviaComponent.findAll());
    }

    @RequestMapping(value = "/rodovia/{id}", method = RequestMethod.GET, produces = "application/json")
    @ResponseBody
    public Rodovia getRodoviaAsJSON(@PathVariable String id) {
        return rodoviaComponent.findByCode(id);
    }

    /**
     * Retorna a quantidade de acidentes de todas as rodovias no acumulado de todos os anos.<BR>
     * Exemplo: BR-116,2000; BR-110,1200, ...
     */
    @RequestMapping(value = "/rodovias/ranking", method = RequestMethod.GET, produces = "application/json")
    @ResponseBody
    public List<OcorrenciaAgrupamentoVO> getRankingRodoviasAsJSON() {
        return rodoviaComponent.ranking();
    }

    /**
     * /rodovias//ranking/2011<BR>
     * retorna a quatidade de acidentes de todas as rodovias no acumulado do ano <BR>
     * Exemplo: BR-11-16,240; BR-11,234; ...
     */
    @RequestMapping(value = "/rodovias/ranking/{ano}", method = RequestMethod.GET, produces = "application/json")
    @ResponseBody
    public List<OcorrenciaAgrupamentoVO> getRankingRodoviasAnoAsJSON(@PathVariable Integer ano) {
        return rodoviaComponent.ranking(ano);
    }

}
