/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.nom.dropegroup.dprf.component;

import br.nom.dropegroup.dprf.dao.RodoviaDAO;
import br.nom.dropegroup.dprf.entity.Rodovia;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author dailton.almeida
 */
@Component
public class RodoviaComponentImpl
    implements RodoviaComponent {

    @Autowired
    private RodoviaDAO rodoviaDAO;
    
    public List<Rodovia> findAll() {
        return rodoviaDAO.findAll();
    }

    public Rodovia findByCode(String code) {
        return rodoviaDAO.findByCode(code);
    }
    
}
