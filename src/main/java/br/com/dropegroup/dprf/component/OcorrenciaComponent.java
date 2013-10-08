/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.dropegroup.dprf.component;

import br.com.dropegroup.dprf.resource.OcorrenciaAgrupamentoVO;
import java.util.List;

/**
 *
 * @author dailton.almeida
 */
public interface OcorrenciaComponent {
    List<OcorrenciaAgrupamentoVO> buscaRankingRodovia();
    List<OcorrenciaAgrupamentoVO> buscaRankingRodovia(Integer ano);
    List<OcorrenciaAgrupamentoVO> buscaRankingRodovia(Integer ano, Integer mes);
}
