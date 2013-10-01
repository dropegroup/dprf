/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.dropegroup.dprf.component;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.dropegroup.dprf.dao.OcorrenciaDAO;
import br.com.dropegroup.dprf.dao.RodoviaDAO;
import br.com.dropegroup.dprf.resource.OcorrenciaAgrupamentoVO;
import br.com.dropegroup.dprf.resource.Rodovia;

@Component
public class RodoviaComponentImpl implements RodoviaComponent {

    @Autowired
    private RodoviaDAO rodoviaDAO;

    @Autowired
    private OcorrenciaDAO ocorrenciaDAO;

    public Collection<Rodovia> findAll() {
        return rodoviaDAO.findAll();
    }

    public Rodovia findByCode(String code) {
        return rodoviaDAO.findByCode(code);
    }

    @Override
    public List<OcorrenciaAgrupamentoVO> ranking() {
        return ocorrenciaDAO.find();
    }

    @Override
    public List<OcorrenciaAgrupamentoVO> ranking(Integer ano) {
        return ocorrenciaDAO.find();
    }

}
