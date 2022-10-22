package SmartWatch;

import SmartDevice.SmartDevice;

public class SmartWatch extends SmartDevice {
    boolean detectaRitmoCardiaco;
    int duracionBateria;
    boolean hasAlarm;
    boolean panicButton;

    public SmartWatch(){}

    public SmartWatch(boolean detectaRitmoCardiaco, int duracionBateria, boolean hasAlarm, boolean panicButton) {
        this.detectaRitmoCardiaco = detectaRitmoCardiaco;
        this.duracionBateria = duracionBateria;
        this.hasAlarm = hasAlarm;
        this.panicButton = panicButton;
    }

    public SmartWatch(String maker, String model, int releaseYear, boolean fastCharge, String displayDetails, boolean detectaRitmoCardiaco, int duracionBateria, boolean hasAlarm, boolean panicButton) {
        super(maker, model, releaseYear, fastCharge, displayDetails);
        this.detectaRitmoCardiaco = detectaRitmoCardiaco;
        this.duracionBateria = duracionBateria;
        this.hasAlarm = hasAlarm;
        this.panicButton = panicButton;
    }

    @Override
    public String toString() {
        return "SmartWatch{" +
                "detectaRitmoCardiaco=" + detectaRitmoCardiaco +
                ", duracionBateria=" + duracionBateria +
                ", hasAlarm=" + hasAlarm +
                ", panicButton=" + panicButton +
                ", maker='" + maker + '\'' +
                ", model='" + model + '\'' +
                ", releaseYear=" + releaseYear +
                ", fastCharge=" + fastCharge +
                ", displayDetails='" + displayDetails + '\'' +
                '}';
    }
}
