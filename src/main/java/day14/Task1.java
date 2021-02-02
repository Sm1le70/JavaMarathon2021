package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        printSumDigits(new File("test"));
    }

    public static void printSumDigits(File file) {
        int sum = 0;
        try {
            Scanner scan = new Scanner(file);

            String[] numbers = scan.nextLine().split(" ");
            if (numbers.length != 10) {
                try {
                    throw new IOException();
                } catch (IOException e) {
                    System.out.println("Некорректный входной файл");
                }
            } else {
                for (String number : numbers) {
                    sum += Integer.parseInt(number);
                }
                System.out.println(sum);
            }
            scan.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }


    }
}
