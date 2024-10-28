package State;

public abstract class SmartDevice {
    private DeviceState state;
    private String name;

    public SmartDevice(String name) {
        this.name = name;
        this.state = new OffState(); // Default state
    }

    public String getName() {
        return name;
    }

    public void setState(DeviceState state) {
        this.state = state;
    }

    public void pressPowerButton() {
        state.pressPowerButton(this);
    }

    public void setStandby() {
        state.setStandby(this);
    }

    public void turnOff() {
        state.turnOff(this);
    }
}

