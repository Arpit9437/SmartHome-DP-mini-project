package State;

public class StandbyState implements DeviceState {
    @Override
    public void pressPowerButton(SmartDevice device) {
        System.out.println(device.getName() + " is in STANDBY. Turning ON now.");
        device.setState(new OnState());
    }

    @Override
    public void setStandby(SmartDevice device) {
        System.out.println(device.getName() + " is already in STANDBY.");
    }

    @Override
    public void turnOff(SmartDevice device) {
        System.out.println(device.getName() + " is turning OFF from STANDBY.");
        device.setState(new OffState());
    }
}
