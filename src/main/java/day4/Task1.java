package day4;

import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Random rand = new Random();
        int n = s.nextInt();
        int[] array = new int[10];
        int over8 = 0, equals1 = 0, even = 0, odd = 0, summ = 0;

        System.out.println("Введено число " + n + ". Сгенерирован следующий массив: ");
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(11);
            System.out.print(array[i] + ", ");
            if (array[i] > 8) over8++;
            if (array[i] == 8) equals1++;
            if (array[i] % 2 == 0) even++;
            else odd++;
            summ += array[i];
        }
        System.out.println("]");
        System.out.println("Длина массива: " + n);
        System.out.println("Количество чисел больше 8: " + over8);
        System.out.println("Количество чисел равных 1: " + equals1);
        System.out.println("Количество четных чисел: " + even);
        System.out.println("Количество нечетных чисел: " + odd);
        System.out.println("Сумма всех элементов массива: " + summ);
    }
}
