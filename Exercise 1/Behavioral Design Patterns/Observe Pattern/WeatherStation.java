import java.util.ArrayList;
import java.util.List;

public class WeatherStation {
    private List<Device> devices = new ArrayList<>();
    private int temperature;

    public void addObserver(Device device) {
        devices.add(device);
    }

    public void removeObserver(Device device) {
        devices.remove(device);
    }

    public void setTemperature(int newTemperature) {
        this.temperature = newTemperature;
        notifyObservers();
    }

    public void notifyObservers() {
        for (Device device : devices) {
            device.update(temperature);
        }
    }
}
