package mediator;

public interface SmartDevice {
    String getName();
    void setMediator(Mediator mediator);
    void send(String event);
}

