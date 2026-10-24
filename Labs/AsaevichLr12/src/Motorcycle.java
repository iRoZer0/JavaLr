public class Motorcycle extends Vehicle {
    private boolean hasSidecar;

    public Motorcycle(String name, int id, double speed, boolean hasSidecar) {
        super(name, id, speed);
        this.hasSidecar = hasSidecar;
    }

    public boolean isHasSidecar() { return hasSidecar; }

    @Override
    public String toString() {
        return "Motorcycle{name=" + getName() + ", id=" + getId() + ", speed=" + getSpeed() + ", hasSidecar=" + hasSidecar + "}";
    }
}