
package waypoints.heremaps.route.response;

import java.util.List;

public class Mode {

    private String type;
    private List<String> transportModes = null;
    private String trafficMode;
    private List<Object> feature = null;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<String> getTransportModes() {
        return transportModes;
    }

    public void setTransportModes(List<String> transportModes) {
        this.transportModes = transportModes;
    }

    public String getTrafficMode() {
        return trafficMode;
    }

    public void setTrafficMode(String trafficMode) {
        this.trafficMode = trafficMode;
    }

    public List<Object> getFeature() {
        return feature;
    }

    public void setFeature(List<Object> feature) {
        this.feature = feature;
    }

}
