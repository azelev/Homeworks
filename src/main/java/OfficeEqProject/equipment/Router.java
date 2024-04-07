package OfficeEqProject.equipment;

public class Router extends OfficeEquipment {
    public Router(int id,
                  String modelName,
                  String manufacturer,
                  int yearOfManufacture,
                  double price,
                  double weight,
                  boolean isOperational,
                  double speed,
                  double band,
                  String security,
                  int ports,
                  double range,
                  boolean isDualBand,
                  String connectivityType) {
        super(id, modelName, manufacturer, yearOfManufacture, price, weight, isOperational);
        this.speed = speed;
        this.band = band;
        this.security = security;
        this.ports = ports;
        this.range = range;
        this.isDualBand = isDualBand;
        this.connectivityType = connectivityType;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getBand() {
        return band;
    }

    public void setBand(double band) {
        this.band = band;
    }

    public String getSecurity() {
        return security;
    }

    public void setSecurity(String security) {
        this.security = security;
    }

    public int getPorts() {
        return ports;
    }

    public void setPorts(int ports) {
        this.ports = ports;
    }

    public double getRange() {
        return range;
    }

    public void setRange(double range) {
        this.range = range;
    }

    public boolean isDualBand() {
        return isDualBand;
    }

    public void setDualBand(boolean dualBand) {
        isDualBand = dualBand;
    }

    public String getConnectivityType() {
        return connectivityType;
    }

    public void setConnectivityType(String connectivityType) {
        this.connectivityType = connectivityType;
    }

    private double speed;
    private double band;
    private String security;
    private int ports;
    private double range;
    private boolean isDualBand;
    private String connectivityType;

    @Override
    public String toString() {
        return "Router{" +
                "speed=" + speed +
                ", band=" + band +
                ", security='" + security + '\'' +
                ", ports=" + ports +
                ", range=" + range +
                ", isDualBand=" + isDualBand +
                ", connectivityType='" + connectivityType + '\'' +
                '}';
    }
}
