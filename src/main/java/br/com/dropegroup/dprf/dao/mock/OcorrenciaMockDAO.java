/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.dropegroup.dprf.dao.mock;

import br.com.dropegroup.dprf.dao.OcorrenciaDAO;
import br.com.dropegroup.dprf.resource.OcorrenciaAgrupamentoVO;
import java.util.ArrayList;
import java.util.List;
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
        oaVoList = new ArrayList<OcorrenciaAgrupamentoVO>();
        oaVoList.add(buildVO("BR-116", "SP", 2010, 1, 1.0));
        oaVoList.add(buildVO("BR-116", "SP", 2010, 1, 2.0));
        oaVoList.add(buildVO("BR-116", "SP", 2010, 2, 3.0));
        oaVoList.add(buildVO("BR-116", "SP", 2011, 3, 4.0));
        oaVoList.add(buildVO("BR-116", "SP", 2011, 4, 5.0));
        oaVoList.add(buildVO("BR-116", "RJ", 2011, 1, 6.0));
        oaVoList.add(buildVO("BR-116", "RJ", 2011, 1, 7.0));
        oaVoList.add(buildVO("BR-116", "RJ", 2011, 2, 8.0));
        oaVoList.add(buildVO("BR-116", "RJ", 2012, 3, 9.0));
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

}
