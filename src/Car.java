public class Car {
    private State currentMode;

    public Car() {
        currentMode = new ComfortMode(60, "Keep calm");
    }

    public void changeMode(State newMode) {
        this.currentMode = newMode;
    }

    public void drive() {
        currentMode.ride();
    }
}
