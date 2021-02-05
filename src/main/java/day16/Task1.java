package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        printResult(new File("test"));
    }

    public static void printResult(File file) {
        double average = 0;
        try {
            Scanner scan = new Scanner(file);
            String[] numbers = scan.nextLine().split(" ");
            for (String number : numbers) {
                average += Double.parseDouble(number);
            }
            average /= numbers.length;
            System.out.printf("%s --> %.3f", average, average);
            scan.close();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}

