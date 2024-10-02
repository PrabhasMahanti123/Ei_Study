public class TabletDisplay implements Device {
    @Override
    public void update(int temperature) {
        System.out.println("Tablet Display: Temperature is now " + temperature + " degrees.");
    }
}
