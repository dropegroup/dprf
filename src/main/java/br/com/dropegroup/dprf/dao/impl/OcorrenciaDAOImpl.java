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

// RETIRAR O COMENTARIO DA LINHA ABAIXO AO SUBSTITUIR O MOCK
// COMENTAR A ANOTACAO CORRESPONDENTE NO OCORRENCIAMOCKDAO
// @Repository
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
            oa.setRodovia((String)resultElement[0]);
            oa.setIndice((Double)resultElement[1]);
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

}
