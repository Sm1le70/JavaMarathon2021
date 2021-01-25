package day6;

import java.util.Random;

public class Teacher {
    private String name;
    private String subject;

    Random rand = new Random();

    public String getName() {
        return name;
    }

    public String getSubject() {
        return subject;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void evaluate(Student st) {
        String grade = "";
        switch (rand.nextInt(4) + 2) {
            case 2:
                grade = "неудовлетворительно";
                break;
            case 3:
                grade = "удовлетворительно";
                break;
            case 4:
                grade = "хорошо";
                break;
            case 5:
                grade = "отлично";
                break;
        }

        System.out.println("Преподаватель " + this.getName() + " оценил студента с именем " + st.getName() + " по предмету " + this.getSubject() + " на оценку " + grade);
    }
}
