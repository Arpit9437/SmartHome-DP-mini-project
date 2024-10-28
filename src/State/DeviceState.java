package State;

public interface DeviceState {
    void pressPowerButton(SmartDevice device);
    void setStandby(SmartDevice device);
    void turnOff(SmartDevice device);
}
