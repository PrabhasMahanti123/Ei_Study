public class DeviceFactory {
    public SmartDevice createDevice(int id, String type) {
        switch (type.toLowerCase()) {
            case "light":
                return new Light(id);
            case "thermostat":
                return new Thermostat(id, 70);  // Default temperature
            case "door lock":
                return new DoorLock(id);
            default:
                throw new IllegalArgumentException("Unknown device type: " + type);
        }
    }
}
