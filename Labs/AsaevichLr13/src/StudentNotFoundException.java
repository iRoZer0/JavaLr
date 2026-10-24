public class StudentNotFoundException extends Exception {
    private int id;

    public StudentNotFoundException(String message, int id) {
        super(message);
        this.id = id;
    }

    public int getId() { return id; }
}