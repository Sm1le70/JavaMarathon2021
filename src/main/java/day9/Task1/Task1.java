package day9.Task1;

import java.util.concurrent.TimeoutException;

public class Task1 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Tom", "Math");
        Student student = new Student("Bob", "12v5");

        System.out.println(teacher.getSubjectName());
        System.out.println(student.getGroupName());

        teacher.printInfo();
        student.printInfo();
    }
}
