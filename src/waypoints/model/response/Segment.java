package waypoints.model.response;

public class Segment {
	
	private Double fromLat;
	private Double fromLng;
	private Double toLat;
	private Double toLng;
	private Long distance;
	private Long duration;
	
	public Double getFromLat() {
		return fromLat;
	}
	public void setFromLat(Double fromLat) {
		this.fromLat = fromLat;
	}
	public Double getFromLng() {
		return fromLng;
	}
	public void setFromLng(Double fromLng) {
		this.fromLng = fromLng;
	}
	public Double getToLat() {
		return toLat;
	}
	public void setToLat(Double toLat) {
		this.toLat = toLat;
	}
	public Double getToLng() {
		return toLng;
	}
	public void setToLng(Double toLng) {
		this.toLng = toLng;
	}
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
	@Override
	public String toString() {
		return "Segment [fromLat=" + fromLat + ", fromLng=" + fromLng + ", toLat=" + toLat + ", toLng=" + toLng
				+ ", distance=" + distance + ", duration=" + duration + "]";
	}
}
