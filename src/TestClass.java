public class TestClass {
    public static void main(String[] args) {
        Car tesla = new Car();
        tesla.drive();
        tesla.changeMode(new SportMode(250, "Devil"));
        tesla.drive();
        tesla.changeMode(new OffRoadMode(80, "Through the wall"));
        tesla.drive();
    }
}
