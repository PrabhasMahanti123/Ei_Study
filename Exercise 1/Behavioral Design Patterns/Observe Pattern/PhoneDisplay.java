public class PhoneDisplay implements Device {
    @Override
    public void update(int temperature) {
        System.out.println("Phone Display: Temperature is now " + temperature + " degrees.");
    }
}
