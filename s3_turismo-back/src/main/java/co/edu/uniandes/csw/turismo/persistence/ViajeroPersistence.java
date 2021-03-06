/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.csw.turismo.persistence;

import co.edu.uniandes.csw.turismo.entities.ViajeroEntity;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

/**
 *
 * @author Juan Sebastian Gutierrez S.
 */
@Stateless
public class ViajeroPersistence {
    
    @PersistenceContext (unitName="turismoPU")
    protected EntityManager em;
    
    private static final Logger LOGGER= Logger.getLogger (PlanTuristicoPersistence.class .getName());
    
    /**
     * se crea un viajero y se persiste
     * @param viajeroEntity
     * @return 
     */
    public ViajeroEntity create (ViajeroEntity viajeroEntity){
        LOGGER.log(Level.INFO, "Creando un review nuevo");
       em.persist(viajeroEntity);
       return viajeroEntity;
   }
    
    /**
     * se busca un viajero en la base de datos
     * @param viajerosId
     * @return ViajeroEntity
     */
    public ViajeroEntity find(Long viajerosId) {
        LOGGER.log(Level.INFO, "Consultando el viajero con id = {0}", viajerosId );
        return em.find(ViajeroEntity.class, viajerosId);
    }
    
    /**
     * se buscan todos los viajeros
     * @return List
     */
    public List<ViajeroEntity> findAll() {
        LOGGER.log(Level.INFO, "Consultando todos");
        TypedQuery<ViajeroEntity> query = em.createQuery("select u from ViajeroEntity u", ViajeroEntity.class);
        return query.getResultList();
    }
    
    /**
     * se elimina un viajero de la base de datos
     * @param viajerosId 
     */
    public void delete(Long viajerosId) {
         LOGGER.log(Level.INFO, "Borrando viajero con id = {0}", viajerosId);
        ViajeroEntity viajero = em.find(ViajeroEntity.class, viajerosId);
        em.remove(viajero);
    }
    
    /**
     * se elimina la informacion de un usuario y se actualiza
     * @param viajerosId 
     */
    public void deleteInfo(Long viajerosId) {
        LOGGER.log(Level.INFO, "Borrando la informacion del viajero con id = {0}", viajerosId);
        ViajeroEntity viajero = em.find(ViajeroEntity.class, viajerosId);
        viajero.setInformacionPersonal("");
        em.merge(viajero);
    }
    
    /**
     * se actualiza un viajero
     * @param viajeroEntity
     * @return ViajeroEntity
     */
    public ViajeroEntity update(ViajeroEntity viajeroEntity) {
        LOGGER.log(Level.INFO, "Actualizando viajero con id = {0}", viajeroEntity.getId());
        return em.merge(viajeroEntity);
    }
    
    /**
     * se actualiza el nombre de un viajero
     * @param viajerosId
     * @param newName
     * @return ViajeroEntity
     */
    public ViajeroEntity updateName(Long viajerosId, String newName) {
        LOGGER.log(Level.INFO, "Actualizando nombre del viajero con id = {0}", viajerosId);
         ViajeroEntity viajero = em.find(ViajeroEntity.class, viajerosId);
         viajero.setNombreUsuario(newName);
         return em.merge(viajero);
    }
    
    /**
     * se actualiza el idioma de un viajero
     * @param viajerosId
     * @param newIdioma
     * @return ViajeroEntity
     */
    public ViajeroEntity updateIdioma(Long viajerosId, String newIdioma) {
        LOGGER.log(Level.INFO, "Actualizando idioma del viajero con id = {0}", viajerosId);
        ViajeroEntity viajero = em.find(ViajeroEntity.class, viajerosId);
         viajero.setIdioma(newIdioma);
         return em.merge(viajero);
    }
    
    /**
     * se actualiza los planes de un viajero
     * @param viajerosId
     * @param newNumber
     * @return ViajeroEntity
     */
    public ViajeroEntity updatePlanes(Long viajerosId, short newNumber) {
        LOGGER.log(Level.INFO, "Actualizando cantidad de planes del viajero con id = {0}", viajerosId);
        ViajeroEntity viajero = em.find(ViajeroEntity.class, viajerosId);
         viajero.setCantidadPlanes(newNumber);
         return em.merge(viajero);
    }
    
}
