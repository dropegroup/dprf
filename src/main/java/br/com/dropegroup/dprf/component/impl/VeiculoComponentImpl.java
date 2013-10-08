package br.com.dropegroup.dprf.component.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.dropegroup.dprf.component.VeiculoComponent;
import br.com.dropegroup.dprf.converter.VeiculoConverter;
import br.com.dropegroup.dprf.dao.VeiculoDAO;
import br.com.dropegroup.dprf.entity.Veiculo;
import br.com.dropegroup.dprf.resource.VeiculoResource;

@Component
public class VeiculoComponentImpl implements VeiculoComponent {

	@Autowired
	private VeiculoDAO veiculoDAO;

	@Autowired
	private VeiculoConverter converter;

	@Override
	public VeiculoResource findById(Long id) {
		Veiculo veiculo = veiculoDAO.findById(id);
		return converter.toVeiculoResource(veiculo);
	}

}
