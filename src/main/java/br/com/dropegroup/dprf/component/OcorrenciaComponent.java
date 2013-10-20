package br.com.dropegroup.dprf.component;

import java.util.List;

import br.com.dropegroup.dprf.resource.OcorrenciaAgrupamentoVO;
import br.com.dropegroup.dprf.resource.OcorrenciaLocalVO;

public interface OcorrenciaComponent {
    List<OcorrenciaAgrupamentoVO> buscaRankingRodovia();
    List<OcorrenciaAgrupamentoVO> buscaRankingRodovia(Integer ano);
    List<OcorrenciaAgrupamentoVO> buscaRankingRodovia(Integer ano, Integer mes);
    List<OcorrenciaAgrupamentoVO> buscaRankingRodovia(String estado);
    List<OcorrenciaAgrupamentoVO> buscaRankingRodovia(String estado, String rodovia);
    List<OcorrenciaLocalVO> buscaRankingOcorrencias(Integer ano, Integer mes, String estado, String cidade);
    List<OcorrenciaLocalVO> buscaRankingOcorrencias(Integer ano, Integer mes, String estado);
    List<OcorrenciaLocalVO> buscaRankingOcorrencias(Integer ano, Integer mes);
}
