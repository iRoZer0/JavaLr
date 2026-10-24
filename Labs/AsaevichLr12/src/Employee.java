import java.util.ArrayList;
import java.util.List;

public class Employee {
    private int id;
    private String name;
    private String department;
    private int level;
    private List<Integer> performanceReviews;

    public Employee(int id, String name, String department, int level, List<Integer> performanceReviews) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.level = level;
        this.performanceReviews = new ArrayList<>(performanceReviews);
    }

    public double getAveragePerformance() {
        if (performanceReviews == null || performanceReviews.isEmpty()) return 0.0;
        double sum = 0;
        for (int r : performanceReviews) sum += r;
        return sum / performanceReviews.size();
    }

    public int getLevel() { return level; }
    public void setLevel(int level) { this.level = level; }

    public int getId() { return id; }
    public String getName() { return name; }
    public String getDepartment() { return department; }
    public List<Integer> getPerformanceReviews() { return performanceReviews; }

    @Override
    public String toString() {
        return "Employee{id=" + id + ", name=" + name + ", dept=" + department + ", level=" + level + ", avg=" + getAveragePerformance() + "}";
    }
}