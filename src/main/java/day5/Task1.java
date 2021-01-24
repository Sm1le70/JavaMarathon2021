package day5;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Car car = new Car();

        car.setYear(s.nextInt());
        s.nextLine(); // поглощает перенос строки после nextInt(), не знаю как сделать по-другому
        car.setColor(s.nextLine());
        car.setModel(s.nextLine());

        System.out.println("Год выпуска: " + car.getYear() + ", цвет: " + car.getColor() + " ,модель: " + car.getModel());
    }
}
