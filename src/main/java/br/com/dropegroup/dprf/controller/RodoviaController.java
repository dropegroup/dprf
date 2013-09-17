/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.dropegroup.dprf.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.dropegroup.dprf.component.RodoviaComponent;
import br.nom.dropegroup.dprf.entity.Rodovia;

/**
 *
 * @author dailton.almeida
 */
@Service
@RequestMapping("/")
public class RodoviaController {
    Logger logger = LoggerFactory.getLogger(RodoviaController.class);

    @Autowired
    private RodoviaComponent rodoviaComponent;
    
    @RequestMapping(value = "/rodovias", method = RequestMethod.GET, produces = "application/json")
    @ResponseBody
    public List<Rodovia> getAllRodoviasAsJSON() {
        if (logger.isInfoEnabled()) {
            logger.info("Executing getAllRodoviasAsJSON ...");
        }
        return new ArrayList<Rodovia>(rodoviaComponent.findAll());
    }

    @RequestMapping(value = "/rodovia/{id}", method = RequestMethod.GET, produces = "application/json")
    @ResponseBody
    public Rodovia getRodoviaAsJSON(@PathVariable String id) {
        if (logger.isInfoEnabled()) {
            logger.info("Executing getRodoviaAsJSON with parameter [" + id + "]");
        }
        return rodoviaComponent.findByCode(id);
    }
}
