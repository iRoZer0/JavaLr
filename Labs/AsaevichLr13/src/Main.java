//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    List<Student> students = new ArrayList<>();

    try {
        students.add(new Student(1, "Ivanov", 20, 4, "A"));
        students.add(new Student(2, "Petrov", 19, 2, "A"));
        students.add(new Student(3, "Sidorov", 21, 5, "B"));
    } catch (InvalidStudentDataException e) {
        System.out.println("Ошибка создания студента: " + e.getMessage());
    }

    try {
        students.add(new Student(4, "", 20, 4, "A"));
    } catch (InvalidStudentDataException e) {
        System.out.println("Ошибка создания студента: " + e.getMessage());
    }

    try {
        students.add(new Student(5, "Kuznetsov", 15, 4, "A"));
    } catch (InvalidStudentDataException e) {
        System.out.println("Ошибка создания студента: " + e.getMessage());
    }

    try {
        students.add(new Student(6, "Smirnov", 20, 7, "A"));
    } catch (InvalidStudentDataException e) {
        System.out.println("Ошибка создания студента: " + e.getMessage());
    }

    StudentService.printAll(students);

    try {
        StudentService.updateGrade(students, 1, 5);
        System.out.println("Оценка обновлена");
    } catch (StudentNotFoundException e) {
        System.out.println("Не найден: " + e.getMessage() + ", id=" + e.getId());
    } catch (GradeUpdateException e) {
        System.out.println("Ошибка оценки: " + e.getMessage());
    }

    try {
        StudentService.updateGrade(students, 1, 9);
    } catch (StudentNotFoundException e) {
        System.out.println("Не найден: " + e.getMessage());
    } catch (GradeUpdateException e) {
        System.out.println("Ошибка оценки: " + e.getMessage());
    }

    try {
        StudentService.updateGrade(students, 999, 4);
    } catch (StudentNotFoundException e) {
        System.out.println("Не найден: " + e.getMessage() + ", id=" + e.getId());
    } catch (GradeUpdateException e) {
        System.out.println("Ошибка оценки: " + e.getMessage());
    }

    try {
        StudentService.promoteStudent(students, 2);
        System.out.println("Студент переведён");
    } catch (StudentNotFoundException e) {
        System.out.println("Не найден: " + e.getMessage());
    } catch (GradeUpdateException e) {
        System.out.println("Ошибка перевода: " + e.getMessage());
    }

    try {
        StudentService.promoteStudent(students, 1);
        System.out.println("Студент переведён");
    } catch (StudentNotFoundException e) {
        System.out.println("Не найден: " + e.getMessage());
    } catch (GradeUpdateException e) {
        System.out.println("Ошибка перевода: " + e.getMessage());
    }

    StudentService.printAll(students);
}
