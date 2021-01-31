package day12.task4;

import java.util.ArrayList;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        List<String> members1 = new ArrayList<>();
        List<String> members2 = new ArrayList<>();
        members1.add("Bob Smith");
        members1.add("James Johnson");
        members2.add("Mason Williams");
        members2.add("Evelyn Brown");
        MusicBand group1 = new MusicBand("AAAAA", 1996, members1);
        MusicBand group2 = new MusicBand("BBBBB", 2000, members2);

        group1.printMembers();
        group2.printMembers();
        MusicBand.transferMembers(group1, group2);
        group1.printMembers();
        group2.printMembers();
    }
}
