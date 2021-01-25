package day6;

public class Task3 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        Student student = new Student();

        teacher.setName("Том");
        teacher.setSubject("Математика");
        student.setName("Билл");

        teacher.evaluate(student);
    }
}
