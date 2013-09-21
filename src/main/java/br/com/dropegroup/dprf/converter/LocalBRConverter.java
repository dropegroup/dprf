package br.com.dropegroup.dprf.converter;

import org.springframework.stereotype.Component;

import br.com.dropegroup.dprf.entity.LocalBR;
import br.com.dropegroup.dprf.resource.Rodovia;

@Component
public class LocalBRConverter {

	public Rodovia toRodovia(LocalBR localBR) {
		Rodovia rodovia = new Rodovia();
		rodovia.setCode(localBR.getBr());
		rodovia.setType(localBR.getAtualizacao());
		return rodovia;
	}
}
