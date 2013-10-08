/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.dropegroup.dprf.component;

import br.com.dropegroup.dprf.dao.OcorrenciaDAO;
import br.com.dropegroup.dprf.resource.OcorrenciaAgrupamentoVO;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author dailton.almeida
 */
@Component
public class OcorrenciaComponentImpl implements OcorrenciaComponent {

    @Autowired
    private OcorrenciaDAO ocorrenciaDAO;

    @Override
    public List<OcorrenciaAgrupamentoVO> buscaRankingRodovia() {
        return ocorrenciaDAO.find();
    }

    @Override
    public List<OcorrenciaAgrupamentoVO> buscaRankingRodovia(Integer ano) {
        return ocorrenciaDAO.find(ano);
    }

    @Override
    public List<OcorrenciaAgrupamentoVO> buscaRankingRodovia(Integer ano, Integer mes) {
        return ocorrenciaDAO.find(ano, mes);
    }
}
