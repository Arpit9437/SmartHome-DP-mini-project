package State;

public class OffState implements DeviceState {
    @Override
    public void pressPowerButton(SmartDevice device) {
        System.out.println(device.getName() + " is OFF. Turning ON now.");
        device.setState(new OnState());
    }

    @Override
    public void setStandby(SmartDevice device) {
        System.out.println(device.getName() + " can't go to STANDBY while OFF.");
    }

    @Override
    public void turnOff(SmartDevice device) {
        System.out.println(device.getName() + " is already OFF.");
    }
}
