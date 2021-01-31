package day12.task5;

import java.util.ArrayList;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        List<MusicArtist> members1 = new ArrayList<>();
        List<MusicArtist> members2 = new ArrayList<>();

        members1.add(new MusicArtist("Bob Smith", 21));
        members1.add(new MusicArtist("James Johnson", 35));
        members2.add(new MusicArtist("Mason Williams", 19));
        members2.add(new MusicArtist("Evelyn Brown", 25));

        MusicBand group1 = new MusicBand("AAAAA", 1996, members1);
        MusicBand group2 = new MusicBand("BBBBB", 2000, members2);

        group1.printMembers();
        group2.printMembers();
        MusicBand.transferMembers(group1, group2);
        group1.printMembers();
        group2.printMembers();
    }
}
