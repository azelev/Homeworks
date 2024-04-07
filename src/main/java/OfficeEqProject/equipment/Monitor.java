package OfficeEqProject.equipment;


public class Monitor extends OfficeEquipment {
    public Monitor(int id,
                   String modelName,
                   String manufacturer,
                   int yearOfManufacture,
                   double price,
                   double weight,
                   boolean isOperational,
                   double screenSize,
                   int resolution,
                   String panelType,
                   double refreshRate,
                   boolean isCurved,
                   int ports,
                   boolean isHDR) {
        super(id, modelName, manufacturer, yearOfManufacture, price, weight, isOperational);
        this.screenSize = screenSize;
        this.resolution = resolution;
        this.panelType = panelType;
        this.refreshRate = refreshRate;
        this.isCurved = isCurved;
        this.ports = ports;
        this.isHDR = isHDR;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    public int getResolution() {
        return resolution;
    }

    public void setResolution(int resolution) {
        this.resolution = resolution;
    }

    public String getPanelType() {
        return panelType;
    }

    public void setPanelType(String panelType) {
        this.panelType = panelType;
    }

    public double getRefreshRate() {
        return refreshRate;
    }

    public void setRefreshRate(double refreshRate) {
        this.refreshRate = refreshRate;
    }

    public boolean isCurved() {
        return isCurved;
    }

    public void setCurved(boolean curved) {
        isCurved = curved;
    }

    public int getPorts() {
        return ports;
    }

    public void setPorts(int ports) {
        this.ports = ports;
    }

    public boolean isHDR() {
        return isHDR;
    }

    public void setHDR(boolean HDR) {
        isHDR = HDR;
    }

    private double screenSize;
    private int resolution;
    private String panelType;
    private double refreshRate;
    private boolean isCurved;
    private int ports;
    private boolean isHDR;

    @Override
    public String toString() {
        return "Monitor{" +
                "screenSize=" + screenSize +
                ", resolution=" + resolution +
                ", panelType='" + panelType + '\'' +
                ", refreshRate=" + refreshRate +
                ", isCurved=" + isCurved +
                ", ports=" + ports +
                ", isHDR=" + isHDR +
                '}';
    }
}

