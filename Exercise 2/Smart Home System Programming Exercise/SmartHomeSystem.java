import java.util.*;

public class SmartHomeSystem {
    private Map<Integer, SmartDevice> devices;
    private List<String> schedule;
    private List<String> triggers;

    public SmartHomeSystem() {
        devices = new HashMap<>();
        schedule = new ArrayList<>();
        triggers = new ArrayList<>();
    }

    public void addDevice(SmartDevice device) {
        devices.put(device.getId(), device);
        System.out.println("Added " + device.getType() + " with ID " + device.getId());
    }

    public void removeDevice(int id) {
        devices.remove(id);
        System.out.println("Removed device with ID " + id);
    }

    public void turnOnDevice(int id) {
        SmartDevice device = devices.get(id);
        if (device != null) {
            device.turnOn();
        } else {
            System.out.println("Device not found!");
        }
    }

    public void turnOffDevice(int id) {
        SmartDevice device = devices.get(id);
        if (device != null) {
            device.turnOff();
        } else {
            System.out.println("Device not found!");
        }
    }

    public void setSchedule(int deviceId, String time, String action) {
        String scheduleEntry = "Device " + deviceId + " at " + time + ": " + action;
        schedule.add(scheduleEntry);
        System.out.println("Scheduled: " + scheduleEntry);
    }

    public void addTrigger(String condition, String action) {
        String triggerEntry = "If " + condition + ", then " + action;
        triggers.add(triggerEntry);
        System.out.println("Trigger added: " + triggerEntry);
    }

    public void showStatus() {
        for (SmartDevice device : devices.values()) {
            System.out.println(device.getType() + " " + device.getId() + " is " + device.getStatus());
        }
    }
}
