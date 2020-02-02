package waypoints.service;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;

import waypoints.heremaps.route.response.HereMapsResponse;
import waypoints.heremaps.route.response.Leg;
import waypoints.heremaps.weather.response.HereMapsWeatherResponse;
import waypoints.model.request.LatLong;
import waypoints.model.request.RequestModel;
import waypoints.model.response.ResponseModel;
import waypoints.model.response.Segment;
import waypoints.model.response.Weatheratdest;

@Stateless
public class RouteService {
	
	private static final String WAYPOINT = "waypoint";
	private static final String API_KEY = "O_0es3AG8oJG8DeyKhhy4uQLlFAZ6LeqT7J2UhOetmI";

	public ResponseModel getRoute (RequestModel requestModel) {
    	Client client = ClientBuilder.newClient();
    	WebTarget target = client.target("https://route.ls.hereapi.com/routing/7.2/calculateroute.json");
    	int count = 0;
    	for (LatLong latlong:requestModel.getWaypoints()) {
    		target = target.queryParam(WAYPOINT+count, latlong.getLat()+","+latlong.getLng());
    		count++;
    	}
    	target = target.queryParam("mode", "fastest;car");
    	target = target.queryParam("apiKey", API_KEY);
    	HereMapsResponse hereMapsResponse = target.request().get(HereMapsResponse.class);
    	
    	ResponseModel responseModel = new ResponseModel();
    	List<Segment> segments = new ArrayList<Segment>();
    	for(Leg leg:hereMapsResponse.getResponse().getRoute().get(0).getLeg()) {
    		Segment segment = new Segment();
    		segment.setFromLat(leg.getStart().getMappedPosition().getLatitude());
    		segment.setFromLng(leg.getStart().getMappedPosition().getLongitude());
    		segment.setToLat(leg.getEnd().getMappedPosition().getLatitude());
    		segment.setToLng(leg.getEnd().getMappedPosition().getLongitude());
    		segment.setDistance(leg.getLength());
    		segment.setDuration(leg.getTravelTime());
    		segments.add(segment);
    		
    	}
    	responseModel.setSegments(segments);
    	responseModel.setDistance(hereMapsResponse.getResponse().getRoute().get(0).getSummary().getDistance());
    	responseModel.setDuration(hereMapsResponse.getResponse().getRoute().get(0).getSummary().getTravelTime());
    	
    	return responseModel;
	}
	
	public Weatheratdest getWeather(Double lat, Double lng) {
		Client client = ClientBuilder.newClient();
    	WebTarget target = client.target("https://weather.ls.hereapi.com/weather/1.0/report.json")
    						.queryParam("product", "observation")
    						.queryParam("latitude", lat)
    						.queryParam("longitude", lng)
    						.queryParam("oneobservation", true)
    						.queryParam("apiKey", API_KEY);
    	HereMapsWeatherResponse hereMapsWeatherResponse = target.request().get(HereMapsWeatherResponse.class);
    
    	Weatheratdest weatheratdest = new Weatheratdest();
    	weatheratdest.setDaylight(hereMapsWeatherResponse.getObservations().getLocation().get(0).getObservation().get(0).getDaylight());
    	weatheratdest.setDescription(hereMapsWeatherResponse.getObservations().getLocation().get(0).getObservation().get(0).getDescription());
    	weatheratdest.setTemperature(hereMapsWeatherResponse.getObservations().getLocation().get(0).getObservation().get(0).getTemperature());
	    return weatheratdest;
	}
	
}
