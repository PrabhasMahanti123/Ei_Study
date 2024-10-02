public class Thermostat extends SmartDevice {
    private int temperature;

    public Thermostat(int id, int temperature) {
        super(id, "thermostat");
        this.temperature = temperature;
    }

    @Override
    public void turnOn() {
        this.status = "on";
        System.out.println("Thermostat " + id + " is on, set to " + temperature + " degrees.");
    }

    @Override
    public void turnOff() {
        this.status = "off";
        System.out.println("Thermostat " + id + " is off.");
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        System.out.println("Thermostat " + id + " is set to " + temperature + " degrees.");
    }

    public int getTemperature() {
        return temperature;
    }
}
