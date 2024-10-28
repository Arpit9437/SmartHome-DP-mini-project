package observer;

public class SecurityCamera extends SmartDevice {
    private boolean alert;

    public SecurityCamera() {
        super("Security Camera");
    }

    @Override
    public void changeStatus(String status) {
        this.alert = status.equals("alert");
        notifyObservers(alert ? "Security alert triggered!" : "Security is normal.");
    }
}