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
    public Employee getEmployee() {
    	Employee e = new Employee();
    	e.setEmpId(122);
    	e.setName("Rahul");
    	e.setSalary(40000);
    	return e;
    }
    @POST
    @Path("/storeEmp")
    @Consumes(value= {MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
    @Produces(MediaType.APPLICATION_XML)
    public Employee storeEmployee(Employee e) {
    	System.out.println("Emp ID :"+e.getEmpId()+"Employee Name"+e.getName()+"Employee Salary"+e.getSalary());
    	return e;
    }
}
