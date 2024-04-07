package OfficeEqProject.equipment;

public class Printer extends OfficeEquipment {
    public Printer(int id,
                   String modelName,
                   String manufacturer,
                   int yearOfManufacture,
                   double price,
                   double weight,
                   boolean isOperational,
                   String printTechnology,
                   int printSpeed,
                   int maxResolution,
                   boolean isColor,
                   int paperSize,
                   String connectivity,
                   double dutyCycle) {
        super(id, modelName, manufacturer, yearOfManufacture, price, weight, isOperational);
        this.printTechnology = printTechnology;
        this.printSpeed = printSpeed;
        this.maxResolution = maxResolution;
        this.isColor = isColor;
        this.paperSize = paperSize;
        this.connectivity = connectivity;
        this.dutyCycle = dutyCycle;
    }

    public String getPrintTechnology() {
        return printTechnology;
    }

    public void setPrintTechnology(String printTechnology) {
        this.printTechnology = printTechnology;
    }

    public int getPrintSpeed() {
        return printSpeed;
    }

    public void setPrintSpeed(int printSpeed) {
        this.printSpeed = printSpeed;
    }

    public int getMaxResolution() {
        return maxResolution;
    }

    public void setMaxResolution(int maxResolution) {
        this.maxResolution = maxResolution;
    }

    public boolean isColor() {
        return isColor;
    }

    public void setColor(boolean color) {
        isColor = color;
    }

    public int getPaperSize() {
        return paperSize;
    }

    public void setPaperSize(int paperSize) {
        this.paperSize = paperSize;
    }

    public String getConnectivity() {
        return connectivity;
    }

    public void setConnectivity(String connectivity) {
        this.connectivity = connectivity;
    }

    public double getDutyCycle() {
        return dutyCycle;
    }

    public void setDutyCycle(double dutyCycle) {
        this.dutyCycle = dutyCycle;
    }

    private String printTechnology;
    private int printSpeed;
    private int maxResolution;
    private boolean isColor;
    private int paperSize;
    private String connectivity;
    private double dutyCycle;

    @Override
    public String toString() {
        return "Printer{" +
                "printTechnology='" + printTechnology + '\'' +
                ", printSpeed=" + printSpeed +
                ", maxResolution=" + maxResolution +
                ", isColor=" + isColor +
                ", paperSize=" + paperSize +
                ", connectivity='" + connectivity + '\'' +
                ", dutyCycle=" + dutyCycle +
                '}';
    }
}
