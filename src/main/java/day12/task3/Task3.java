package day12.task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        List<MusicBand> groups = new ArrayList<MusicBand>();
        List<MusicBand> groupsAfter2000 = new ArrayList<MusicBand>();
        groups.add(new MusicBand("Niravana", 1996));
        groups.add(new MusicBand("Bibs", 2001));
        groups.add(new MusicBand("Kaneps", 2011));
        groups.add(new MusicBand("AC/DC", 1973));
        groups.add(new MusicBand("Group", 1987));
        groups.add(new MusicBand("Moop", 1983));
        groups.add(new MusicBand("Titaty", 2005));
        groups.add(new MusicBand("Nana", 1999));
        groups.add(new MusicBand("Groooo", 2007));
        groups.add(new MusicBand("Gilll", 2000));
        Collections.shuffle(groups);

        groupsAfter2000 = groupsAfter2000(groups);

        for (MusicBand group : groups) {
            System.out.println(group.getName() + " " + group.getYear());
        }
        System.out.println("Группы, основанные после 2000 года:");
        for (MusicBand group : groupsAfter2000) {
            System.out.println(group.getName() + " " + group.getYear());
        }
    }

    public static List<MusicBand> groupsAfter2000(List<MusicBand> bands) {
        List<MusicBand> groupsAfter2000 = new ArrayList<MusicBand>();
        for (MusicBand band : bands) {
            if (band.getYear() > 2000) groupsAfter2000.add(band);
        }

        return groupsAfter2000;
    }
}
