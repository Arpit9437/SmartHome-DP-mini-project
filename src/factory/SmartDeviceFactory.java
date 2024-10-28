package factory;

public class SmartDeviceFactory {
    public static SmartDevice createDevice(String deviceType) {
        switch (deviceType.toLowerCase()) {
            case "light":
                return new Light();
            case "camera":
                return new SecurityCamera();
            case "alarm":
                return new Alarm();
            default:
                throw new IllegalArgumentException("Unknown device type: " + deviceType);
        }
    }
}
