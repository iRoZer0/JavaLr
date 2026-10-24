public class Student {
    private int id;
    private String name;
    private int age;
    private int grade;
    private String group;

    public Student(int id, String name, int age, int grade, String group) throws InvalidStudentDataException {
        if (name == null || name.isEmpty()) {
            throw new InvalidStudentDataException("Имя не может быть пустым");
        }
        if (age < 16 || age > 60) {
            throw new InvalidStudentDataException("Возраст должен быть от 16 до 60: " + age);
        }
        if (grade < 1 || grade > 5) {
            throw new InvalidStudentDataException("Оценка должна быть от 1 до 5: " + grade);
        }
        this.id = id;
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.group = group;
    }

    public void updateGrade(int newGrade) throws GradeUpdateException {
        if (newGrade < 1 || newGrade > 5) {
            throw new GradeUpdateException("Недопустимая оценка: " + newGrade);
        }
        this.grade = newGrade;
    }

    public void promote() throws GradeUpdateException {
        if (grade < 3) {
            throw new GradeUpdateException("Нельзя перевести студента с оценкой " + grade);
        }
        this.grade = grade + 1;
        if (this.grade > 5) this.grade = 5;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public int getAge() { return age; }
    public int getGrade() { return grade; }
    public String getGroup() { return group; }

    @Override
    public String toString() {
        return "Student{id=" + id + ", name=" + name + ", age=" + age
                + ", grade=" + grade + ", group=" + group + "}";
    }
}