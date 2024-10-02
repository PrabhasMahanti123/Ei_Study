public class Main {
    public static void main(String[] args) {
        DeviceFactory factory = new DeviceFactory();
        SmartHomeSystem homeSystem = new SmartHomeSystem();

        SmartDevice light1 = factory.createDevice(1, "light");
        SmartDevice thermostat1 = factory.createDevice(2, "thermostat");
        SmartDevice door1 = factory.createDevice(3, "door lock");

        homeSystem.addDevice(light1);
        homeSystem.addDevice(thermostat1);
        homeSystem.addDevice(door1);

        // Proxy usage example
        DeviceProxy lightProxy = new DeviceProxy(light1);
        lightProxy.turnOn();
        lightProxy.turnOff();

        homeSystem.turnOnDevice(2);
        homeSystem.setSchedule(1, "06:00", "Turn On");
        homeSystem.addTrigger("temperature > 75", "turnOff(1)");

        homeSystem.showStatus();
    }
}
