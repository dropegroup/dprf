package br.com.dropegroup.dprf.dao.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import br.com.dropegroup.dprf.dao.OcorrenciaDAO;
import br.com.dropegroup.dprf.resource.OcorrenciaAgrupamentoVO;

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
            Long ocorrencias = (Long) resultElement[1];

            agrupamento.add(new OcorrenciaAgrupamentoVO("" + resultElement[0], ocorrencias.intValue()));
        }

        return agrupamento;
    }

    @Override
    public List<OcorrenciaAgrupamentoVO> find(Integer rodovia) {
        return Collections.emptyList();
    }

    @Override
    public List<OcorrenciaAgrupamentoVO> find(Integer rodovia, String estado) {
        return Collections.emptyList();
    }

}
