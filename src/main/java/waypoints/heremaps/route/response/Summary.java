
package waypoints.heremaps.route.response;

import java.util.List;

public class Summary {

    private Long distance;
    private Long trafficTime;
    private Long baseTime;
    private List<String> flags = null;
    private String text;
    private Long travelTime;
    private String type;

    public Long getDistance() {
        return distance;
    }

    public void setDistance(Long distance) {
        this.distance = distance;
    }

    public Long getTrafficTime() {
        return trafficTime;
    }

    public void setTrafficTime(Long trafficTime) {
        this.trafficTime = trafficTime;
    }

    public Long getBaseTime() {
        return baseTime;
    }

    public void setBaseTime(Long baseTime) {
        this.baseTime = baseTime;
    }

    public List<String> getFlags() {
        return flags;
    }

    public void setFlags(List<String> flags) {
        this.flags = flags;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Long getTravelTime() {
        return travelTime;
    }

    public void setTravelTime(Long travelTime) {
        this.travelTime = travelTime;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}
