/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.dropegroup.dprf.dao.mock;

import br.com.dropegroup.dprf.dao.OcorrenciaDAO;
import br.com.dropegroup.dprf.resource.OcorrenciaAgrupamentoVO;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import org.springframework.stereotype.Repository;

/**
 *
 * @author dailton.almeida
 */
@Repository
public class OcorrenciaMockDAO implements OcorrenciaDAO {

    private List<OcorrenciaAgrupamentoVO> oaVoList;

    private OcorrenciaAgrupamentoVO buildVO(String rodovia, String estado, Integer ano, Integer mes, Double indice) {
        OcorrenciaAgrupamentoVO oa = new OcorrenciaAgrupamentoVO();
        oa.setRodovia(rodovia);
        oa.setEstado(estado);
        oa.setAno(ano);
        oa.setMes(mes);
        oa.setIndice(indice);
        return oa;
    }

    public OcorrenciaMockDAO() {
        // dados de teste
        Random r = new Random();
        oaVoList = new ArrayList<OcorrenciaAgrupamentoVO>();
        for (String rodovia : Arrays.asList("BR-110", "BR-116")) {
            for (String estado : Arrays.asList("SP", "RJ", "MG", "ES", "PR", "SC", "RS")) {
                for (int ano = 2007; ano <= 2013; ano++) {
                    for (int mes = 1; mes <= 12; mes++) {
                        oaVoList.add(buildVO(rodovia, estado, ano, mes, r.nextDouble()));
                    }
                }
            }
        }
    }

    @Override
    public List<OcorrenciaAgrupamentoVO> find() {
        List<OcorrenciaAgrupamentoVO> result = new ArrayList<OcorrenciaAgrupamentoVO>();
        for (OcorrenciaAgrupamentoVO x : oaVoList) {
            result.add(x);
        }
        return result; // loop acima intencional ; retorna copia do array armazenado
    }

    @Override
    public List<OcorrenciaAgrupamentoVO> find(Integer ano) {
        List<OcorrenciaAgrupamentoVO> result = new ArrayList<OcorrenciaAgrupamentoVO>();
        for (OcorrenciaAgrupamentoVO x : oaVoList) {
            if (ano.equals(x.getAno())) {
                result.add(x);
            }
        }
        return result;
    }

    @Override
    public List<OcorrenciaAgrupamentoVO> find(Integer ano, Integer mes) {
        List<OcorrenciaAgrupamentoVO> result = new ArrayList<OcorrenciaAgrupamentoVO>();
        for (OcorrenciaAgrupamentoVO x : oaVoList) {
            if (ano.equals(x.getAno()) && mes.equals(x.getMes())) {
                result.add(x);
            }
        }
        return result;
    }

    @Override
    public List<OcorrenciaAgrupamentoVO> find(String estado) {
        List<OcorrenciaAgrupamentoVO> result = new ArrayList<OcorrenciaAgrupamentoVO>();
        for (OcorrenciaAgrupamentoVO x : oaVoList) {
            if (estado.equals(x.getEstado())) {
                result.add(x);
            }
        }
        return result;
    }

    @Override
    public List<OcorrenciaAgrupamentoVO> find(String estado, String rodovia) {
        List<OcorrenciaAgrupamentoVO> result = new ArrayList<OcorrenciaAgrupamentoVO>();
        for (OcorrenciaAgrupamentoVO x : oaVoList) {
            if (estado.equals(x.getEstado()) && rodovia.equals(x.getRodovia())) {
                result.add(x);
            }
        }
        return result;
    }    
}
