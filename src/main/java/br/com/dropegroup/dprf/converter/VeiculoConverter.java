package br.com.dropegroup.dprf.converter;

import org.springframework.stereotype.Component;

import br.com.dropegroup.dprf.entity.Veiculo;
import br.com.dropegroup.dprf.resource.VeiculoResource;

@Component
public class VeiculoConverter {

	public VeiculoResource toVeiculoResource(Veiculo veiculo) {
		VeiculoResource resource = new VeiculoResource();
		resource.setId(veiculo.getId());
		resource.setAno(veiculo.getAno());
		resource.setDescricao(veiculo.getDescricao());
		return resource;
	}
}
