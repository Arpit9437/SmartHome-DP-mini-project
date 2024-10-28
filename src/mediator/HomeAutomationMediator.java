package mediator;

import java.util.ArrayList;
import java.util.List;

public class HomeAutomationMediator implements Mediator {
    private List<SmartDevice> devices = new ArrayList<>();

    @Override
    public void registerDevice(SmartDevice device) {
        devices.add(device);
        device.setMediator(this);
    }

    @Override
    public void notify(String event, SmartDevice device) {
        switch (event) {
            case "turnOnLights":
                System.out.println("Turning on lights based on device: " + device.getName());
                // Logic to turn on lights
                break;
            case "setAlarm":
                System.out.println("Setting alarm based on device: " + device.getName());
                // Logic to set alarm
                break;
            case "securityAlert":
                System.out.println("Alerting security based on device: " + device.getName());
                // Logic for security alerts
                break;
            default:
                break;
        }
    }
}
