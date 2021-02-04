package day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        try {
            Scanner scan = new Scanner(new File("./src/main/resources/shoes.csv"));
            PrintWriter pw = new PrintWriter(new File("./src/main/resources/missing_shoes.txt"));
            while (scan.hasNextLine()) {
                String[] temp = scan.nextLine().split(";");
                if (temp[2].equals("0")) {
                    pw.println(temp[0] + ", " + temp[1] + ", " + temp[2]);
                }
            }
            scan.close();
            pw.close();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
