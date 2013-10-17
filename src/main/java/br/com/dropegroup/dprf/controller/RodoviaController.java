package br.com.dropegroup.dprf.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.dropegroup.dprf.component.RodoviaComponent;
import br.com.dropegroup.dprf.resource.Rodovia;
import org.springframework.http.ResponseEntity;

@Service
@RequestMapping("/")
public class RodoviaController {
    @Autowired
    private ControllerUtils controllerUtils;
    @Autowired
    private RodoviaComponent rodoviaComponent;

    @RequestMapping(value = "/rodovias", method = RequestMethod.GET, produces = "application/json")
    @ResponseBody
    public ResponseEntity getAllRodoviasAsJSON() {
        try {
            return controllerUtils.toResponseEntity(new ArrayList<Rodovia>(rodoviaComponent.findAll()));
        } catch (Exception e) {
            return controllerUtils.toResponseEntity(e);
        }
    }

    @RequestMapping(value = "/rodovia/{id}", method = RequestMethod.GET, produces = "application/json")
    @ResponseBody
    public ResponseEntity getRodoviaAsJSON(@PathVariable String id) {
        try {
            return controllerUtils.toResponseEntity(rodoviaComponent.findByCode(id));
        } catch (Exception e) {
            return controllerUtils.toResponseEntity(e);
        }
    }

}
