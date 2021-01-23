package day4;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] array = new int[100];
        int max = 0, min = 0, count = 0, summ = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(10001);
        }

        for (int x : array) {
            if (x > max) max = x;
            if (x < min) min = x;
            if (x % 10 == 0 || x == 0) {
                count++;
                summ += x;
            }
        }

        System.out.println("Наибольший элемент массива: " + max);
        System.out.println("Наименьший элемент массива: " + min);
        System.out.println("Количество элементов массива, оканчивающихся на 0: " + count);
        System.out.println("Сумму элементов массива, оканчивающихся на 0: " + summ);
    }
}
