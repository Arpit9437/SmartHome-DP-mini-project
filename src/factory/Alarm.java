package factory;

public class Alarm implements SmartDevice {
    @Override
    public void operate() {
        System.out.println("The alarm is sounding!");
    }

    @Override
    public String getName() {
        return "Alarm";
    }
}