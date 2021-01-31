package day12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<String> cars = new ArrayList<String>(Arrays.asList("Honda", "BMW", "Lada", "Tesla", "Toyota"));
        for (String car : cars) {
            System.out.println(car);
        }

        cars.add(3, "Mersedes");
        cars.remove(0);
        for (String car : cars) {
            System.out.println(car);
        }
    }
}
