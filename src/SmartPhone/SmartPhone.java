package SmartPhone;

import SmartDevice.SmartDevice;

public class SmartPhone extends SmartDevice {
    int backCamera;
    String backCameraDetails;
    int frontCamera;
    String frontCameraDetails;

    public SmartPhone(){}

    public SmartPhone(int backCamera, String backCameraDetails, int frontCamera, String frontCameraDetails) {
        this.backCamera = backCamera;
        this.backCameraDetails = backCameraDetails;
        this.frontCamera = frontCamera;
        this.frontCameraDetails = frontCameraDetails;
    }

    public SmartPhone(String maker, String model, int releaseYear, boolean fastCharge, String displayDetails, int backCamera, String backCameraDetails, int frontCamera, String frontCameraDetails) {
        super(maker, model, releaseYear, fastCharge, displayDetails);
        this.backCamera = backCamera;
        this.backCameraDetails = backCameraDetails;
        this.frontCamera = frontCamera;
        this.frontCameraDetails = frontCameraDetails;
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "backCamera=" + backCamera +
                ", backCameraDetails='" + backCameraDetails + '\'' +
                ", frontCamera=" + frontCamera +
                ", frontCameraDetails='" + frontCameraDetails + '\'' +
                ", maker='" + maker + '\'' +
                ", model='" + model + '\'' +
                ", releaseYear=" + releaseYear +
                ", fastCharge=" + fastCharge +
                ", displayDetails='" + displayDetails + '\'' +
                '}';
    }
}
