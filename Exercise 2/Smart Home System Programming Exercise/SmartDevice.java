public abstract class SmartDevice {
    protected int id;
    protected String type;
    protected String status;

    public SmartDevice(int id, String type) {
        this.id = id;
        this.type = type;
        this.status = "off";
    }

    public abstract void turnOn();

    public abstract void turnOff();

    public int getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
