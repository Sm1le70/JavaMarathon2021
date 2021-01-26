package day7;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random rand = new Random();
        Player[] player = new Player[10];

        for (int i = 0; i < 10; i++) {
            Player.info();
            player[i] = new Player(rand.nextInt((100 - 90) + 1) + 90);
            System.out.println(Player.getCountPlayers());
        }

        for (int i = 0; i < 100; i++) {
            player[1].run();
        }
        System.out.println(Player.getCountPlayers());
    }
}
