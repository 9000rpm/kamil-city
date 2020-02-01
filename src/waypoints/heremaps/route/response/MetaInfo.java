
package waypoints.heremaps.route.response;

import java.util.List;

public class MetaInfo {

    private String timestamp;
    private String mapVersion;
    private String moduleVersion;
    private String interfaceVersion;
    private List<String> availableMapVersion = null;

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getMapVersion() {
        return mapVersion;
    }

    public void setMapVersion(String mapVersion) {
        this.mapVersion = mapVersion;
    }

    public String getModuleVersion() {
        return moduleVersion;
    }

    public void setModuleVersion(String moduleVersion) {
        this.moduleVersion = moduleVersion;
    }

    public String getInterfaceVersion() {
        return interfaceVersion;
    }

    public void setInterfaceVersion(String interfaceVersion) {
        this.interfaceVersion = interfaceVersion;
    }

    public List<String> getAvailableMapVersion() {
        return availableMapVersion;
    }

    public void setAvailableMapVersion(List<String> availableMapVersion) {
        this.availableMapVersion = availableMapVersion;
    }

}
