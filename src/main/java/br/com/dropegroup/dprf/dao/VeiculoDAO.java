package br.com.dropegroup.dprf.dao;

import br.com.dropegroup.dprf.entity.Veiculo;

public interface VeiculoDAO {

	/**
	 * Gets the <code>Veiculo</code> identified by <code>id</code>.
	 * 
	 * @param id The identification of <code>Veiculo</code>.
	 * @return The <code>Veiculo</code> identified by <code>id</code> or <code>null</code> if doesn't exist.
	 */
	Veiculo findById(Long id);
}
