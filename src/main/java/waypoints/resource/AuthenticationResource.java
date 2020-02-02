package waypoints.resource;

import javax.ejb.EJB;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import waypoints.model.request.Credentials;
import waypoints.service.AuthenticationService;

@Path("/auth")
public class AuthenticationResource {
	
	@EJB
	AuthenticationService authenticationService;
	
	@POST
	@Path("/getToken")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response authenticateUser(Credentials credentials) {
		// We would pass the username and password to a database or LDAP to authenticate the user credentials. Here we are just hard coding.
	    if (credentials.getUsername().equals("john@doe.com") && credentials.getPassword().equals("123456")) {
	    	String token = authenticationService.createJWT(credentials.getUsername(), "Joe", "Me");
	    	return Response.ok(token).build();
	    } else {
	    	return Response.status(Response.Status.FORBIDDEN).build();
	    }
	}
}
