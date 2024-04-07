package OfficeEqProject.equipment;

public class Projector extends OfficeEquipment {
    public Projector(int id,
                     String modelName,
                     String manufacturer,
                     int yearOfManufacture,
                     double price,
                     double weight,
                     boolean isOperational,
                     String lumens,
                     int resolution,
                     double contrastRatio,
                     double lampLife,
                     double projectionSize,
                     String connectivity,
                     boolean is3DReady) {
        super(id, modelName, manufacturer, yearOfManufacture, price, weight, isOperational);
        this.lumens = lumens;
        this.resolution = resolution;
        this.contrastRatio = contrastRatio;
        this.lampLife = lampLife;
        this.projectionSize = projectionSize;
        this.connectivity = connectivity;
        this.is3DReady = is3DReady;
    }

    public String getLumens() {
        return lumens;
    }

    public void setLumens(String lumens) {
        this.lumens = lumens;
    }

    public int getResolution() {
        return resolution;
    }

    public void setResolution(int resolution) {
        this.resolution = resolution;
    }

    public double getContrastRatio() {
        return contrastRatio;
    }

    public void setContrastRatio(double contrastRatio) {
        this.contrastRatio = contrastRatio;
    }

    public double getLampLife() {
        return lampLife;
    }

    public void setLampLife(double lampLife) {
        this.lampLife = lampLife;
    }

    public double getProjectionSize() {
        return projectionSize;
    }

    public void setProjectionSize(double projectionSize) {
        this.projectionSize = projectionSize;
    }

    public String getConnectivity() {
        return connectivity;
    }

    public void setConnectivity(String connectivity) {
        this.connectivity = connectivity;
    }

    public boolean isIs3DReady() {
        return is3DReady;
    }

    public void setIs3DReady(boolean is3DReady) {
        this.is3DReady = is3DReady;
    }

    private String lumens;
    private int resolution;
    private double contrastRatio;
    private double lampLife;
    private double projectionSize;
    private String connectivity;
    private boolean is3DReady;

    @Override
    public String toString() {
        return "Projector{" +
                "lumens='" + lumens + '\'' +
                ", resolution=" + resolution +
                ", contrastRatio=" + contrastRatio +
                ", lampLife=" + lampLife +
                ", projectionSize=" + projectionSize +
                ", connectivity='" + connectivity + '\'' +
                ", is3DReady=" + is3DReady +
                '}';
    }
}
