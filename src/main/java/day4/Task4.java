package day4;

import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        int[] array = new int[100];
        Random rand = new Random();
        int summ = 0, maxSumm = 0, maxIndex = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(10001);
            //System.out.print(array[i] + " ");
        }
        //System.out.println();

        for (int i = 1; i < array.length - 1; i++) {
            summ = array[i - 1] + array[i] + array[i + 1];
            if (summ > maxSumm) {
                maxSumm = summ;
                maxIndex = i - 1;
            }
        }
        System.out.println(maxSumm);
        System.out.println(maxIndex);
    }
}
