public class Car extends Vehicle {
    private int doors;

    public Car(String name, int id, double speed, int doors) {
        super(name, id, speed);
        this.doors = doors;
    }

    public int getDoors() { return doors; }

    @Override
    public String toString() {
        return "Car{name=" + getName() + ", id=" + getId() + ", speed=" + getSpeed() + ", doors=" + doors + "}";
    }
}