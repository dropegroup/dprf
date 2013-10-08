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

}
