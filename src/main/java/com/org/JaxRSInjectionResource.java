package com.org;


import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("injection")
public class JaxRSInjectionResource {

	@GET
	@Path("/store/{empId}/{ename}")
	@Produces(MediaType.TEXT_PLAIN)
	public String storeEmployee(@PathParam("empId")int id,@PathParam("ename") String name) {
		return "empID"+id+"name"+name;
	}
	
	@GET
	@Path("/departments/{id}/employees")
	@Produces(MediaType.TEXT_PLAIN)
	public String getAllEmployeeByDepartment(@PathParam("id")int deptId,@QueryParam("designation")String desig) {
		return "Department"+deptId+"designation"+desig;
	}
	
	@POST
	@Path("/store")
	@Produces(MediaType.TEXT_PLAIN)
	public String storeEmp(@FormParam("n1")int deptid,@FormParam("n2")String name,@FormParam("salary")int salary) {
		return "Employee " +deptid+ " with a name "+name+" and salary "+salary+" stored";
	}
}
