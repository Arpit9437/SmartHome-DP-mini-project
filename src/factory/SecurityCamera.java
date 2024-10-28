package factory;

public class SecurityCamera implements SmartDevice {
    @Override
    public void operate() {
        System.out.println("The security camera is recording.");
    }

    @Override
    public String getName() {
        return "Security Camera";
    }
}