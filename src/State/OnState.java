package State;

public class OnState implements DeviceState {
    @Override
    public void pressPowerButton(SmartDevice device) {
        System.out.println(device.getName() + " is already ON. Turning OFF now.");
        device.setState(new OffState());
    }

    @Override
    public void setStandby(SmartDevice device) {
        System.out.println(device.getName() + " is going to STANDBY.");
        device.setState(new StandbyState());
    }

    @Override
    public void turnOff(SmartDevice device) {
        System.out.println(device.getName() + " is turning OFF.");
        device.setState(new OffState());
    }
}
