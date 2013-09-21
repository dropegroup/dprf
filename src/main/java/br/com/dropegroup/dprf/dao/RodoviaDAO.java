package br.com.dropegroup.dprf.dao;

import java.util.Collection;

import br.com.dropegroup.dprf.resource.Rodovia;

/**
 *
 */
public interface RodoviaDAO {

	/**
	 * Gets a collection of all <code>Rodovia</code>.
	 * 
	 * @return A collection of all <code>Rodovia</code>.
	 */
	Collection<Rodovia> findAll();

	/**
	 * Gets the <code>Rodovia</code> identified by <code>code</code>.
	 * 
	 * @param code The identification of <code>Rodovia</code> (For example, for Rodovia BR-110 the code is 110).
	 * @return The <code>Rodovia</code> identified by <code>code</code> or <code>null</code> if doesn't exist.
	 */
	Rodovia findByCode(String code);
}
