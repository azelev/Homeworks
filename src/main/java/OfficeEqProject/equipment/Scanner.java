package OfficeEqProject.equipment;

public class Scanner extends OfficeEquipment {
    public Scanner(int id,
                   String modelName,
                   String manufacturer,
                   int yearOfManufacture,
                   double price,
                   double weight,
                   boolean isOperational,
                   int scanResolution,
                   int scanSpeed,
                   double colorDepth,
                   int maxPaperSize,
                   String connectivity,
                   boolean isDuplexScanning,
                   String scannerType) {
        super(id, modelName, manufacturer, yearOfManufacture, price, weight, isOperational);
        this.scanResolution = scanResolution;
        this.scanSpeed = scanSpeed;
        this.colorDepth = colorDepth;
        this.maxPaperSize = maxPaperSize;
        this.connectivity = connectivity;
        this.isDuplexScanning = isDuplexScanning;
        this.scannerType = scannerType;
    }

    public int getScanResolution() {
        return scanResolution;
    }

    public void setScanResolution(int scanResolution) {
        this.scanResolution = scanResolution;
    }

    public int getScanSpeed() {
        return scanSpeed;
    }

    public void setScanSpeed(int scanSpeed) {
        this.scanSpeed = scanSpeed;
    }

    public double getColorDepth() {
        return colorDepth;
    }

    public void setColorDepth(double colorDepth) {
        this.colorDepth = colorDepth;
    }

    public int getMaxPaperSize() {
        return maxPaperSize;
    }

    public void setMaxPaperSize(int maxPaperSize) {
        this.maxPaperSize = maxPaperSize;
    }

    public String getConnectivity() {
        return connectivity;
    }

    public void setConnectivity(String connectivity) {
        this.connectivity = connectivity;
    }

    public boolean isDuplexScanning() {
        return isDuplexScanning;
    }

    public void setDuplexScanning(boolean duplexScanning) {
        isDuplexScanning = duplexScanning;
    }

    public String getScannerType() {
        return scannerType;
    }

    public void setScannerType(String scannerType) {
        this.scannerType = scannerType;
    }

    private int scanResolution;
    private int scanSpeed;
    private double colorDepth;
    private int maxPaperSize;
    private String connectivity;
    private boolean isDuplexScanning;
    private String scannerType;

    @Override
    public String toString() {
        return "Scanner{" +
                "scanResolution=" + scanResolution +
                ", scanSpeed=" + scanSpeed +
                ", colorDepth=" + colorDepth +
                ", maxPaperSize=" + maxPaperSize +
                ", connectivity='" + connectivity + '\'' +
                ", isDuplexScanning=" + isDuplexScanning +
                ", scannerType='" + scannerType + '\'' +
                '}';
    }
}
