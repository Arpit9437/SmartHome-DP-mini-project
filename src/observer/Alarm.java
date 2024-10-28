package observer;

public class Alarm extends SmartDevice {
    private boolean isTriggered;

    public Alarm() {
        super("Alarm");
    }

    @Override
    public void changeStatus(String status) {
        this.isTriggered = status.equals("triggered");
        notifyObservers(isTriggered ? "Alarm is triggered!" : "Alarm is disarmed.");
    }
}