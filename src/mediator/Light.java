package mediator;

public class Light implements SmartDevice {
    private Mediator mediator;

    @Override
    public String getName() {
        return "Light";
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