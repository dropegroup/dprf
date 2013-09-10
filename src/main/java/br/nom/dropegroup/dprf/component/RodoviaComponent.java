/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.nom.dropegroup.dprf.component;

import br.nom.dropegroup.dprf.entity.Rodovia;
import java.util.List;

/**
 *
 * @author dailton.almeida
 */
public interface RodoviaComponent {
    List<Rodovia> findAll();
    Rodovia findByCode(String code);
}
