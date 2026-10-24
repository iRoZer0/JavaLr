import java.util.List;

public class StudentService {

    public static Student findById(List<Student> students, int id) throws StudentNotFoundException {
        for (Student s : students) {
            if (s.getId() == id) return s;
        }
        throw new StudentNotFoundException("Студент с id=" + id + " не найден", id);
    }

    public static void updateGrade(List<Student> students, int id, int newGrade)
            throws StudentNotFoundException, GradeUpdateException {
        Student s = findById(students, id);
        s.updateGrade(newGrade);
    }

    public static void promoteStudent(List<Student> students, int id)
            throws StudentNotFoundException, GradeUpdateException {
        Student s = findById(students, id);
        s.promote();
    }

    public static void printAll(List<Student> students) {
        for (Student s : students) System.out.println(s);
    }
}