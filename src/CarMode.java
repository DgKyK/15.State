public abstract class CarMode implements State {
    private int speed;
    private String name;

    public CarMode(int speed, String name) {
        this.speed = speed;
        this.name = name;
    }

    @Override
    public void ride() {
        System.out.println("Mode : " + name + ", max speed :" + speed);
    }
}
