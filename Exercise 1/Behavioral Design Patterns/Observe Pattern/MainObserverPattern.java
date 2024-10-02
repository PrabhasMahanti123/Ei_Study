public class MainObserverPattern {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();
        Device phoneDisplay = new PhoneDisplay();
        Device tabletDisplay = new TabletDisplay();

        weatherStation.addObserver(phoneDisplay);
        weatherStation.addObserver(tabletDisplay);

        weatherStation.setTemperature(25);
        weatherStation.setTemperature(30);
    }
}
