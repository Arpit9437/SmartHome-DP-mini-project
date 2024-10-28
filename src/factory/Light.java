package factory;

public class Light implements SmartDevice {
    @Override
    public void operate() {
        System.out.println("The light is turned ON.");
    }

    @Override
    public String getName() {
        return "Light";
    }
}

