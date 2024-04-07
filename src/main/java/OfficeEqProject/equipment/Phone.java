package OfficeEqProject.equipment;

public class Phone extends OfficeEquipment {
    public Phone(int id,
                 String modelName,
                 String manufacturer,
                 int yearOfManufacture,
                 double price,
                 double weight,
                 boolean isOperational,
                 int screenSize,
                 double storageSize,
                 String operatingSystem,
                 double batteryLife,
                 boolean isSmart,
                 double cameraResolution,
                 String processorType) {
        super(id, modelName, manufacturer, yearOfManufacture, price, weight, isOperational);
        this.screenSize = screenSize;
        this.storageSize = storageSize;
        this.operatingSystem = operatingSystem;
        this.batteryLife = batteryLife;
        this.isSmart = isSmart;
        this.cameraResolution = cameraResolution;
        this.processorType = processorType;
    }

    public int getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(int screenSize) {
        this.screenSize = screenSize;
    }

    public double getStorageSize() {
        return storageSize;
    }

    public void setStorageSize(double storageSize) {
        this.storageSize = storageSize;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public double getBatteryLife() {
        return batteryLife;
    }

    public void setBatteryLife(double batteryLife) {
        this.batteryLife = batteryLife;
    }

    public boolean isSmart() {
        return isSmart;
    }

    public void setSmart(boolean smart) {
        isSmart = smart;
    }

    public double getCameraResolution() {
        return cameraResolution;
    }

    public void setCameraResolution(double cameraResolution) {
        this.cameraResolution = cameraResolution;
    }

    public String getProcessorType() {
        return processorType;
    }

    public void setProcessorType(String processorType) {
        this.processorType = processorType;
    }

    private int screenSize;
    private double storageSize;
    private String operatingSystem;
    private double batteryLife;
    private boolean isSmart;
    private double cameraResolution;
    private String processorType;

    @Override
    public String toString() {
        return "Phone{" +
                "screenSize=" + screenSize +
                ", storageSize=" + storageSize +
                ", operatingSystem='" + operatingSystem + '\'' +
                ", batteryLife=" + batteryLife +
                ", isSmart=" + isSmart +
                ", cameraResolution=" + cameraResolution +
                ", processorType='" + processorType + '\'' +
                '}';
    }
}

