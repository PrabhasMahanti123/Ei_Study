public class DeviceProxy {
    private SmartDevice device;

    public DeviceProxy(SmartDevice device) {
        this.device = device;
    }

    public void turnOn() {
        System.out.println("Proxy: Checking access rights...");
        device.turnOn();
    }

    public void turnOff() {
        System.out.println("Proxy: Checking access rights...");
        device.turnOff();
    }
}
