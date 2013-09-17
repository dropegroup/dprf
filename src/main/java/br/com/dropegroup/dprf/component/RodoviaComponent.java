
package br.com.dropegroup.dprf.component;

import java.util.Collection;

import br.com.dropegroup.dprf.entity2.Rodovia;

/**
 *
 * @author dailton.almeida
 */
public interface RodoviaComponent {
    Collection<Rodovia> findAll();
    Rodovia findByCode(String code);
}
