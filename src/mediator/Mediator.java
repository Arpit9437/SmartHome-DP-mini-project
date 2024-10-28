package mediator;

public interface Mediator {
    void registerDevice(SmartDevice device);
    void notify(String event, SmartDevice device);
}
