package day12;

import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        List<Integer> evenNumbers = new ArrayList<Integer>();
        for (int i = 0; i <= 350; i++) {
            if (i % 2 == 0) {
                if ((i >= 0 && i <= 30) || (i >= 300 && i <= 350))
                    evenNumbers.add(i);
            }
        }

        for (int number : evenNumbers) {
            System.out.print(number + " ");
        }
    }
}
