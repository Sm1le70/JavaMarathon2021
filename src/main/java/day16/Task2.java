package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        try {
            double average = 0;
            int count = 0;
            Random random = new Random();
            File file1 = new File("file1.txt");
            File file2 = new File("file2.txt");
            PrintWriter pw1 = new PrintWriter(file1);
            PrintWriter pw2 = new PrintWriter(file2);

            for (int i = 0; i < 1000; i++) {
                pw1.print(random.nextInt(100 + 1));
                if (i != 999) {
                    pw1.print(" ");
                }
            }
            pw1.close();

            Scanner scan = new Scanner(file1);
            String[] numbers = scan.nextLine().split(" ");

            for (int i = 0; i < numbers.length; i++) {
                average += Integer.parseInt(numbers[i]);
                if ((i + 1) % 20 == 0) {
                    pw2.print(average / 20);
                    average = 0;
                    if (i < numbers.length - 1) {
                        pw2.print(" ");
                    }
                }
            }
            pw2.close();
            scan.close();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

        printResult(new File("file2.txt"));
    }

    public static void printResult(File file) {
        double sum = 0;
        try {
            Scanner scan = new Scanner(file);
            String[] numbers = scan.nextLine().split(" ");
            for (String number : numbers) {
                sum += Double.parseDouble(number);
            }
            System.out.println((int)sum);
            scan.close();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
