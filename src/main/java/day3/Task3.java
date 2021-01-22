package day3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            double x = s.nextDouble();
            double y = s.nextDouble();
            switch ((int) y) {
                case 0:
                    System.out.println("Деление на 0");
                    break;
                default:
                    System.out.println(x / y);
            }

        }
    }
}
