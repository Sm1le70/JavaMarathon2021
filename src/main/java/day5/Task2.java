package day5;


import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int year = s.nextInt();
        s.nextLine(); // поглощает перенос строки после nextInt(), не знаю как сделать по-другому
        String color = s.nextLine();
        String model = s.nextLine();

        Motorbike moto = new Motorbike(year, color, model);

        System.out.println("Год выпуска: " + moto.getYear() + ", цвет: " + moto.getColor() + ", модель: " + moto.getModel());
    }
}
