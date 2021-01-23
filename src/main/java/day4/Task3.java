package day4;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        int m = 12, n = 8, stringSumm = 0, maxSumm = 0, maxString = 0;
        int[][] array = new int[m][n];
        Random rand = new Random();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = rand.nextInt(51);
                stringSumm += array[i][j];
                //System.out.printf("%2d ", array[i][j]); //для проверки
            }

            if (stringSumm >= maxSumm) {
                maxSumm = stringSumm;
                maxString = i;
            }

            //System.out.println("   // сумма - " + stringSumm); //для проверки
            stringSumm = 0;
        }
        System.out.println(maxString);
    }
}
