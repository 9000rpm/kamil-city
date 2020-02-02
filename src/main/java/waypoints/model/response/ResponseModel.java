package waypoints.model.response;

import java.util.List;

public class ResponseModel {
	
	private Long distance;
	private Long duration;
	private List<Segment> segments;
	private Weatheratdest weatheratdest;
	
	public Long getDistance() {
		return distance;
	}
	public void setDistance(Long distance) {
		this.distance = distance;
	}
	public Long getDuration() {
		return duration;
	}
	public void setDuration(Long duration) {
		this.duration = duration;
	}
	public List<Segment> getSegments() {
		return segments;
	}
	public void setSegments(List<Segment> segments) {
		this.segments = segments;
	}
	public Weatheratdest getWeatheratdest() {
		return weatheratdest;
	}
	public void setWeatheratdest(Weatheratdest weatheratdest) {
		this.weatheratdest = weatheratdest;
	}
}
