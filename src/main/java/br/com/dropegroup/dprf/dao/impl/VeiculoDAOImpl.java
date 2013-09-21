package br.com.dropegroup.dprf.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import br.com.dropegroup.dprf.dao.VeiculoDAO;
import br.com.dropegroup.dprf.entity.Veiculo;

@Repository
public class VeiculoDAOImpl implements VeiculoDAO {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public Veiculo findById(Long id) {
		Query query = entityManager
				.createQuery("select v from Veiculo v where veiid = " + id);
		return (Veiculo) query.getSingleResult();
	}

}
