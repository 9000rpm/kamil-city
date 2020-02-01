package waypoints.model.request;

import java.util.List;

public class RequestModel {
	
	private Long departuredate;
	private List<LatLong> waypoints;
	
	public Long getDeparturedate() {
		return departuredate;
	}
	public void setDeparturedate(Long departuredate) {
		this.departuredate = departuredate;
	}
	public List<LatLong> getWaypoints() {
		return waypoints;
	}
	public void setWaypoints(List<LatLong> waypoints) {
		this.waypoints = waypoints;
	}

}
