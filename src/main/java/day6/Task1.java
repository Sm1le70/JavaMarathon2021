package day6;

public class Task1 {
    public static void main(String[] args) {
        int inputYear = 1960;
        Motorbike moto = new Motorbike(1980, "Red", "Honda");
        moto.info();
        System.out.println(moto.yearDifference(inputYear));
    }
}
