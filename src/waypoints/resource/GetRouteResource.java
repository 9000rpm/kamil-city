package waypoints.resource;

import javax.ejb.EJB;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import waypoints.model.request.LatLong;
import waypoints.model.request.RequestModel;
import waypoints.model.response.ResponseModel;
import waypoints.service.RouteService;

@Path("/route")
public class GetRouteResource {
	
	@EJB
	RouteService routeService;

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
    	ResponseModel responseModel = routeService.getRoute(requestModel);
    	LatLong latLongDest = requestModel.getWaypoints().get(requestModel.getWaypoints().size()-1);
    	responseModel.setWeatheratdest(routeService.getWeather(latLongDest.getLat(), latLongDest.getLng()));
    	return Response.ok(responseModel).build();
    }

}
