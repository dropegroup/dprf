package br.com.dropegroup.dprf.component;

import java.util.Collection;
import java.util.List;

import br.com.dropegroup.dprf.resource.OcorrenciaAgrupamentoVO;
import br.com.dropegroup.dprf.resource.Rodovia;

public interface RodoviaComponent {

    Collection<Rodovia> findAll();

    Rodovia findByCode(String code);

    List<OcorrenciaAgrupamentoVO> ranking();

    List<OcorrenciaAgrupamentoVO> ranking(Integer ano);

}
