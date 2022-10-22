import SmartDevice.SmartDevice;
import SmartPhone.SmartPhone;
import SmartWatch.SmartWatch;

public class Main {
    public static void main(String[] args) {
        SmartDevice celularVacio = new SmartPhone();
        SmartDevice celularCompleto = new SmartPhone("Samsung","Galaxy Pro",1500,true,"860 x 600",4,"20mpx",2,"10mpx");

        SmartDevice relojVacio = new SmartWatch();
        SmartDevice relojCompleto = new SmartWatch("Samsung","Watch Pro 2017",2017,false,"100px x 100px",true,36,true,true);

        System.out.println(celularCompleto);
        System.out.println(celularVacio);
        System.out.println(relojCompleto);
        System.out.println(relojVacio);
    }
}