/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.nom.dropegroup.dprf.controller;

import br.nom.dropegroup.dprf.component.RodoviaComponent;
import br.nom.dropegroup.dprf.entity.Rodovia;
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
public class RodoviaController {

    @Autowired
    private RodoviaComponent rodoviaComponent;
    
    @RequestMapping(value = "/rodovias", method = RequestMethod.GET, produces = "application/json")
    @ResponseBody
    public List<Rodovia> getAllRodoviasAsJSON() {
        return rodoviaComponent.findAll();
    }

    @RequestMapping(value = "/rodovia/{id}", method = RequestMethod.GET, produces = "application/json")
    @ResponseBody
    public Rodovia getRodoviaAsJSON(@PathVariable String id) {
        return rodoviaComponent.findByCode(id);
    }
}
