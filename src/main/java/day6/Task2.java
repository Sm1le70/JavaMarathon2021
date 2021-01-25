package day6;

public class Task2 {
    public static void main(String[] args) {
        Airplane plane = new Airplane("boeing", 2010, 88, 5000);
        plane.setYear(2005);
        plane.setLength(100);
        plane.fillUp(110);
        plane.fillUp(73);
        plane.info();
    }
}
