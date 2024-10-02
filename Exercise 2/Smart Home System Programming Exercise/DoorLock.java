public class DoorLock extends SmartDevice {
    public DoorLock(int id) {
        super(id, "door lock");
    }

    @Override
    public void turnOn() {
        this.status = "locked";
        System.out.println("Door " + id + " is locked.");
    }

    @Override
    public void turnOff() {
        this.status = "unlocked";
        System.out.println("Door " + id + " is unlocked.");
    }
}
