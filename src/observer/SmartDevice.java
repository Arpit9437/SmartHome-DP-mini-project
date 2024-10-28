package observer;

import java.util.ArrayList;
import java.util.List;

public abstract class SmartDevice implements Subject {
    private List<Observer> observers = new ArrayList<>();
    private String name;

    public SmartDevice(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }

    public abstract void changeStatus(String status);
}
