package day7;

public class Task1 {
    public static void main(String[] args) {
        Airplane plane1 = new Airplane("Boeing", 2010, 88, 5000);
        Airplane plane2 = new Airplane("Airbus", 2012, 145, 8000);

        Airplane.compareAirplanes(plane1, plane2);
    }
}