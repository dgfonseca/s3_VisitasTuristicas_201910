/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.csw.turismo.persistence;

import co.edu.uniandes.csw.turismo.entities.PlanTuristicoEntity;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Christer Osorio
 */

@Stateless
public class PlanTuristicoPersistence {
    private static final Logger LOGGER= Logger.getLogger (PlanTuristicoPersistence.class .getName());
    @PersistenceContext (unitName="turismoPU")
    protected EntityManager em;
    
   public PlanTuristicoEntity create (PlanTuristicoEntity planTuristicoEntity){
       em.persist(planTuristicoEntity);
       return planTuristicoEntity;
   }
    
}
