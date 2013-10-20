/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.dropegroup.dprf.component;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.dropegroup.dprf.dao.OcorrenciaDAO;
import br.com.dropegroup.dprf.resource.OcorrenciaAgrupamentoVO;
import br.com.dropegroup.dprf.resource.OcorrenciaLocalVO;

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

    @Override
    public List<OcorrenciaAgrupamentoVO> buscaRankingRodovia(String estado) {
        return ocorrenciaDAO.find(estado);
    }

    @Override
    public List<OcorrenciaAgrupamentoVO> buscaRankingRodovia(String estado, String rodovia) {
        return ocorrenciaDAO.find(estado, rodovia);
    }

    @Override
    public List<OcorrenciaLocalVO> buscaRankingOcorrencias(Integer ano, Integer mes, String estado, String cidade) {
        return ocorrenciaDAO.find(ano, mes, estado, cidade);
    }

    @Override
    public List<OcorrenciaLocalVO> buscaRankingOcorrencias(Integer ano, Integer mes, String estado) {
        return ocorrenciaDAO.find(ano, mes, estado, null);
    }

    @Override
    public List<OcorrenciaLocalVO> buscaRankingOcorrencias(Integer ano, Integer mes) {
        return ocorrenciaDAO.find(ano, mes, null, null);
    }
}
