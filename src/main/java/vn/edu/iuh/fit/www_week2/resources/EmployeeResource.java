package vn.edu.iuh.fit.www_week2.resources;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import vn.edu.iuh.fit.www_week2.models.Employee;
import vn.edu.iuh.fit.www_week2.services.EmployeeService;

@Path("/employees")
public class EmployeeResource {
    private final EmployeeService employeeService;
    private final Logger logger = LoggerFactory.getLogger(this.getClass().getName());
    public EmployeeResource(){
        employeeService = new EmployeeService();
    }

    @GET
    @Path("/{id}")
    @Produces("application/json")
    public Response getEmployeeById(@PathParam("id") long id){
        Employee e = employeeService.findEmployeeById(id);
        return Response.ok(e).build();
    }

    @POST
    @Path("/createEmployee")
    @Produces("application/json")
    public Response createEmployee(Employee e){
        employeeService.add(e);
        return Response.ok(e).build();
    }
}
