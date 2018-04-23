package com.org;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Root resource (exposed at "myresource" path)
 */
@Path("myresource")
public class MyResource {

    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getIt() {
        return "Got it!";
    }
    
    @GET
    @Produces(value = {MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
    @Path("/getEmp")
    public Employe getEmploye() {
    	Employe e = new Employe(122,"Rahul",40000);
    	return e;
    }
    @POST
    @Path("/storeEmp")
    @Consumes(value= {MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
    @Produces(MediaType.APPLICATION_XML)
    public Employe storeEmploye(Employe e) {
    	System.out.println("Emp ID :"+e.getEmpId()+"Employe Name"+e.getName()+"Employe Salary"+e.getSalagy());
    	return e;
    }
}
