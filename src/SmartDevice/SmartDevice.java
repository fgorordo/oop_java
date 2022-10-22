package SmartDevice;

public abstract class SmartDevice {
    protected String maker;
    protected String model;
    protected int releaseYear;
    protected boolean fastCharge;
    protected String displayDetails;

    public SmartDevice() {}

    public SmartDevice(String maker, String model, int releaseYear, boolean fastCharge, String displayDetails) {
        this.maker = maker;
        this.model = model;
        this.releaseYear = releaseYear;
        this.fastCharge = fastCharge;
        this.displayDetails = displayDetails;
    }
}
