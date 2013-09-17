package br.com.dropegroup.dprf.dao.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import br.com.dropegroup.dprf.converter.LocalBRConverter;
import br.com.dropegroup.dprf.dao.RodoviaDAO;
import br.com.dropegroup.dprf.entity.LocalBR;
import br.com.dropegroup.dprf.entity2.Rodovia;

@Repository
public class RodoviaDAOImpl implements RodoviaDAO {

	@PersistenceContext
	private EntityManager entityManager;

	@Autowired
	LocalBRConverter localBRConverter;

	@SuppressWarnings("unchecked")
	@Override
	public Collection<Rodovia> findAll() {
		Query query = entityManager.createQuery("select p from LocalBR p");
		ArrayList<Rodovia> rodovias = new ArrayList<Rodovia>();
		for (LocalBR localBR : (List<LocalBR>) query.getResultList()) {
			rodovias.add(localBRConverter.toRodovia(localBR));
		}
		return rodovias;
	}

	@Override
	public Rodovia findByCode(String code) {
		Query query = entityManager
				.createQuery("select p from LocalBR p where lbrbr = " + code);
		return localBRConverter.toRodovia((LocalBR) query.getSingleResult());
	}

}
