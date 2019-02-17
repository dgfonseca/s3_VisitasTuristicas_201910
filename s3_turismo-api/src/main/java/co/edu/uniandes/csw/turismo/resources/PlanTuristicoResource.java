/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.csw.turismo.resources;

import co.edu.uniandes.csw.turismo.dtos.PlanTuristicoDTO;
import java.util.ArrayList;
import java.util.logging.Logger;
import javax.enterprise.context.RequestScoped;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


/**
 *
 * @author Christer Osorio
 */

@Path("planesTuristicos")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@RequestScoped
public class PlanTuristicoResource {
   
    //private final ArrayList<Object> listaVacia= new ArrayList<>();
    
    private static final Logger LOGGER=Logger.getLogger(PlanTuristicoResource.class.getName());
    
    @POST
    public PlanTuristicoDTO createPlanTuristico (PlanTuristicoDTO planTuristico){
        
        return planTuristico;
    }
    
    
    @GET
    public PlanTuristicoDTO getPlanTuristico()
    {
        return null;
    }
    
    
}
