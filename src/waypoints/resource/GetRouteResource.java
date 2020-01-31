package waypoints.resource;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import waypoints.model.RequestModel;

@Path("/route")
public class GetRouteResource {

    @GET
    @Path("/ping")
    public Response getRoute() {
    	return Response.ok("pong!").build();
    }

	
    @POST
    @Path("/segments")
    @Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
    public Response getRoute(RequestModel requestModel) {
    	System.out.println(requestModel);
    	return Response.ok(requestModel).build();
    }

}
