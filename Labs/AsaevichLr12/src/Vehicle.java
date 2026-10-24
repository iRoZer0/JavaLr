public abstract class Vehicle {
    private String name;
    private int id;
    private double speed;

    public Vehicle(String name, int id, double speed) {
        this.name = name;
        this.id = id;
        this.speed = speed;
    }

    public String getName() { return name; }
    public int getId() { return id; }
    public double getSpeed() { return speed; }

    @Override
    public String toString() {
        return "Vehicle{name=" + name + ", id=" + id + ", speed=" + speed + "}";
    }
}