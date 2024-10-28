import mediator.SmartDevice;
import observer.Alarm;
import observer.Light;
import observer.User;

public class Main {
    public static void main(String[] args) {
        // Factory Pattern
        System.out.println("Factory Pattern:");
        var light = factory.SmartDeviceFactory.createDevice("light");
        var camera = factory.SmartDeviceFactory.createDevice("camera");
        var alarm = factory.SmartDeviceFactory.createDevice("alarm");

        light.operate();
        camera.operate();
        alarm.operate();

        // Observer Pattern
        Light light1 = new Light();
        Alarm alarm1 = new Alarm();

        // Create users
        User user1 = new User("Alice");
        User user2 = new User("Bob");

        // Register users as observers
        light1.registerObserver(user1);
        light1.registerObserver(user2);

        alarm1.registerObserver(user1);

        // Simulate status changes
        light1.changeStatus("ON");
        alarm1.changeStatus("triggered");
        light1.changeStatus("OFF");
        alarm1.changeStatus("normal");

        // Mediator Pattern
        System.out.println("\nMediator Pattern:");
        var mediator = new mediator.HomeAutomationMediator();
        var smartLight = new mediator.Light();
        var smartAlarm = new mediator.Alarm(); // Use the state version of Alarm

        mediator.registerDevice(smartLight);
        mediator.registerDevice(smartAlarm);

        smartLight.send("turnOnLights");
        smartAlarm.send("setAlarm");

        // State Pattern
        System.out.println("\nState Pattern:");
        var stateLight = new State.Light();
        stateLight.pressPowerButton(); // Turn ON
        stateLight.setStandby();        // Go to STANDBY
        stateLight.turnOff();          // Turn OFF
    }
}
