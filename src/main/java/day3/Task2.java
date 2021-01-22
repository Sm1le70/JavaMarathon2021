package day3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double x = s.nextDouble();
        double y = s.nextDouble();

        while (y != 0) {
            System.out.println(x / y);

            x = s.nextDouble();
            y = s.nextDouble();
        }
    }
}
