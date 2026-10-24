import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class EmployeeService {

    public static void removeLowPerformers(List<Employee> employees) {
        Iterator<Employee> it = employees.iterator();
        while (it.hasNext()) {
            Employee e = it.next();
            if (e.getAveragePerformance() < 3) {
                it.remove();
            }
        }
    }

    public static void promoteHighPerformers(List<Employee> employees) {
        for (Employee e : employees) {
            if (e.getAveragePerformance() >= 4) {
                e.setLevel(e.getLevel() + 1);
            }
        }
    }

    public static void printEmployees(List<Employee> employees, int level) {
        for (Employee e : employees) {
            if (e.getLevel() == level) {
                System.out.println(e);
            }
        }
    }

    public static List<Employee> sortByPerformanceDescThenName(List<Employee> employees) {
        List<Employee> copy = new ArrayList<>(employees);
        copy.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee a, Employee b) {
                int cmp = Double.compare(b.getAveragePerformance(), a.getAveragePerformance());
                if (cmp != 0) return cmp;
                return a.getName().compareTo(b.getName());
            }


        });
        return copy;
    }
}