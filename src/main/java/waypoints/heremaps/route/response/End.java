
package waypoints.heremaps.route.response;


public class End {

    private String linkId;
    private MappedPosition mappedPosition;
    private OriginalPosition originalPosition;
    private String type;
    private Double spot;
    private String sideOfStreet;
    private String mappedRoadName;
    private String label;
    private Long shapeIndex;
    private String source;

    public String getLinkId() {
        return linkId;
    }

    public void setLinkId(String linkId) {
        this.linkId = linkId;
    }

    public MappedPosition getMappedPosition() {
        return mappedPosition;
    }

    public void setMappedPosition(MappedPosition mappedPosition) {
        this.mappedPosition = mappedPosition;
    }

    public OriginalPosition getOriginalPosition() {
        return originalPosition;
    }

    public void setOriginalPosition(OriginalPosition originalPosition) {
        this.originalPosition = originalPosition;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Double getSpot() {
        return spot;
    }

    public void setSpot(Double spot) {
        this.spot = spot;
    }

    public String getSideOfStreet() {
        return sideOfStreet;
    }

    public void setSideOfStreet(String sideOfStreet) {
        this.sideOfStreet = sideOfStreet;
    }

    public String getMappedRoadName() {
        return mappedRoadName;
    }

    public void setMappedRoadName(String mappedRoadName) {
        this.mappedRoadName = mappedRoadName;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public Long getShapeIndex() {
        return shapeIndex;
    }

    public void setShapeIndex(Long shapeIndex) {
        this.shapeIndex = shapeIndex;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

}
