package mediator;

public class SecurityCamera implements SmartDevice {
    private Mediator mediator;

    @Override
    public String getName() {
        return "Security Camera";
    }

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void send(String event) {
        mediator.notify(event, this);
    }
}