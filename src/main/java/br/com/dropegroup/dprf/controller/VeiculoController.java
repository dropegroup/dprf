/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.dropegroup.dprf.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.dropegroup.dprf.component.VeiculoComponent;
import br.com.dropegroup.dprf.resource.VeiculoResource;

@Service
@RequestMapping("/")
public class VeiculoController {
	Logger logger = LoggerFactory.getLogger(VeiculoController.class);

	@Autowired
	private VeiculoComponent veiculoComponent;

	@RequestMapping(value = "/veiculo/{id}", method = RequestMethod.GET, produces = "application/json")
	@ResponseBody
	public VeiculoResource getVeiculoAsJSON(@PathVariable Long id) {
		return veiculoComponent.findById(id);
	}
}
