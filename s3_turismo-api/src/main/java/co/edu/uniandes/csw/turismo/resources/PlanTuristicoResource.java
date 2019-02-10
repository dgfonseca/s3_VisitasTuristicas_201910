/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.csw.turismo.resources;

import co.edu.uniandes.csw.turismo.dtos.PlanTuristicoDTO;
import java.util.logging.Logger;
import javax.enterprise.context.RequestScoped;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;


/**
 *
 * @author estudiante
 */

@Path("planesTuristicos")
@Produces("application/json" )
@Consumes("application/json" )
@RequestScoped
public class PlanTuristicoResource {
    
    private static final Logger LOGGER=Logger.getLogger(PlanTuristicoResource.class.getName());
    
    @POST
    public PlanTuristicoDTO createPlanTuristico (PlanTuristicoDTO planTuristico){
        
        return planTuristico;
    }
    
}