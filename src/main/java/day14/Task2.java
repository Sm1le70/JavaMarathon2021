package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Task2 {
    public static void main(String[] args) {
        List<String> people = parseFileToStringList(new File("people"));

        if (people != null) {
            System.out.print(people.toString());
        }
    }

    public static List<String> parseFileToStringList(File file) {
        List<String> people = new ArrayList<>();

        try {
            Scanner scan = new Scanner(file);
            while (scan.hasNextLine()) {
                String[] temp = scan.nextLine().split(" ");     //как-то по-другому это можно сделать?
                if (Integer.parseInt(temp[1]) < 0) {
                    try {
                        throw new IOException();
                    } catch (IOException e) {
                        System.out.println("Некорректный входной файл");
                        return null;
                    }
                } else {
                    people.add(temp[0] + " " + temp[1]);
                }
            }
            scan.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
        return people;
    }
}
