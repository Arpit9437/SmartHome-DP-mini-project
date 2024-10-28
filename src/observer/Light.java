package observer;

public class Light extends SmartDevice {
    private boolean isOn;

    public Light() {
        super("Light");
        this.isOn = false;
    }

    @Override
    public void changeStatus(String status) {
        this.isOn = status.equals("on");
        notifyObservers(isOn ? "Light is turned on." : "Light is turned off.");
    }
}
