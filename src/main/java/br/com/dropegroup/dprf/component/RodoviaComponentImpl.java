/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.dropegroup.dprf.component;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.dropegroup.dprf.dao.RodoviaDAO;
import br.com.dropegroup.dprf.resource.Rodovia;

@Component
public class RodoviaComponentImpl implements RodoviaComponent {

    @Autowired
    private RodoviaDAO rodoviaDAO;

    public Collection<Rodovia> findAll() {
        return rodoviaDAO.findAll();
    }

    public Rodovia findByCode(String code) {
        return rodoviaDAO.findByCode(code);
    }

}
