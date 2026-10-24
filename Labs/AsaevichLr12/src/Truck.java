public class Truck extends Vehicle {
    private double capacity;

    public Truck(String name, int id, double speed, double capacity) {
        super(name, id, speed);
        this.capacity = capacity;
    }

    public double getCapacity() { return capacity; }

    @Override
    public String toString() {
        return "Truck{name=" + getName() + ", id=" + getId() + ", speed=" + getSpeed() + ", capacity=" + capacity + "}";
    }
}