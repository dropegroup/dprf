
package br.com.dropegroup.dprf.component;

import java.util.Collection;

import br.nom.dropegroup.dprf.entity.Rodovia;

/**
 *
 * @author dailton.almeida
 */
public interface RodoviaComponent {
    Collection<Rodovia> findAll();
    Rodovia findByCode(String code);
}
