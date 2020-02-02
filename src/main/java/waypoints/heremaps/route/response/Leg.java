
package waypoints.heremaps.route.response;

import java.util.List;

public class Leg {

    private Start start;
    private End end;
    private Long length;
    private Long travelTime;
    private List<Maneuver> maneuver = null;

    public Start getStart() {
        return start;
    }

    public void setStart(Start start) {
        this.start = start;
    }

    public End getEnd() {
        return end;
    }

    public void setEnd(End end) {
        this.end = end;
    }

    public Long getLength() {
        return length;
    }

    public void setLength(Long length) {
        this.length = length;
    }

    public Long getTravelTime() {
        return travelTime;
    }

    public void setTravelTime(Long travelTime) {
        this.travelTime = travelTime;
    }

    public List<Maneuver> getManeuver() {
        return maneuver;
    }

    public void setManeuver(List<Maneuver> maneuver) {
        this.maneuver = maneuver;
    }

}
