package br.com.dropegroup.dprf.dao.impl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import br.com.dropegroup.dprf.dao.OcorrenciaDAO;
import br.com.dropegroup.dprf.resource.OcorrenciaAgrupamentoVO;
import br.com.dropegroup.dprf.resource.OcorrenciaLocalVO;

// RETIRAR O COMENTARIO DA LINHA ABAIXO AO SUBSTITUIR O MOCK
// COMENTAR A ANOTACAO CORRESPONDENTE NO OCORRENCIAMOCKDAO
@Repository
public class OcorrenciaDAOImpl implements OcorrenciaDAO {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<OcorrenciaAgrupamentoVO> find() {
        String queryString = "select l.km, count(o) from OcorrenciaAgrupamento o, LocalBR l where o.idLocalBr = l.id group by l.km";
        Query query = entityManager.createQuery(queryString);
        @SuppressWarnings("unchecked")
        List<Object[]> result = query.getResultList();

        ArrayList<OcorrenciaAgrupamentoVO> agrupamento = new ArrayList<OcorrenciaAgrupamentoVO>();
        for (Object[] resultElement : result) {
            OcorrenciaAgrupamentoVO oa = new OcorrenciaAgrupamentoVO();
            // PRECISA REVER ESTA SEQUENCIA E/OU MUDAR A QUERY ACIMA
            oa.setRodovia((String) resultElement[0]);
            oa.setIndice((Double) resultElement[1]);
            agrupamento.add(oa);
        }

        return agrupamento;
    }

    @Override
    public List<OcorrenciaAgrupamentoVO> find(Integer rodovia) {
        throw new UnsupportedOperationException("Ainda nao implementado!!!");
    }

    @Override
    public List<OcorrenciaAgrupamentoVO> find(Integer rodovia, Integer mes) {
        throw new UnsupportedOperationException("Ainda nao implementado!!!");
    }

    @Override
    public List<OcorrenciaAgrupamentoVO> find(String estado) {
        throw new UnsupportedOperationException("Ainda nao implementado!!!");
    }

    @Override
    public List<OcorrenciaAgrupamentoVO> find(String estado, String rodovia) {
        throw new UnsupportedOperationException("Ainda nao implementado!!!");
    }

    @Override
    public List<OcorrenciaLocalVO> find(Integer ano, Integer mes, String estado, String cidade) {
        StringBuilder sb = new StringBuilder();
        sb.append("select o.id.uf, o.id.cidade, m.latitude, m.longitude, sum(o.qtd) ");
        sb.append("  from OcorrenciaLocalData o, Municipio m ");
        sb.append("  where o.id.uf = m.uf and o.id.cidade = m.nome ");

        if (ano != null) {
            sb.append("  and o.id.ano=" + ano);
        }
        if (mes != null) {
            sb.append("  and o.id.mes=" + mes);
        }
        if (estado != null) {
            sb.append("  and o.id.uf='" + estado.toUpperCase() + "'");
        }
        if (cidade != null) {
            sb.append("  and o.id.cidade='" + cidade.toUpperCase() + "'");
        }
        sb.append("  group by o.id.uf, o.id.cidade order by sum(o.qtd) desc");
        String queryString = sb.toString();
        
        System.out.println("QueryString: "+sb.toString());

        Query query = entityManager.createQuery(queryString);
        query.setMaxResults(400);
        
        @SuppressWarnings("unchecked")
        List<Object[]> result = query.getResultList();

        ArrayList<OcorrenciaLocalVO> agrupamento = new ArrayList<OcorrenciaLocalVO>();
        for (Object[] resultElement : result) {
            OcorrenciaLocalVO oa = new OcorrenciaLocalVO();
            // PRECISA REVER ESTA SEQUENCIA E/OU MUDAR A QUERY ACIMA
            oa.setEstado((String) resultElement[0]);
            oa.setCidade((String) resultElement[1]);
            oa.setLatitude((Double) resultElement[2]);
            oa.setLongitude((Double) resultElement[3]);
            oa.setOcorrencias(((Long) resultElement[4]).intValue());
            agrupamento.add(oa);
        }

        return agrupamento;
    }
}
