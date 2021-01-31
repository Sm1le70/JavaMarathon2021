package day12.task5;

import java.util.ArrayList;
import java.util.List;

public class MusicBand {
    private String name;
    private int year;
    private List<MusicArtist> members = new ArrayList<MusicArtist>();

    public MusicBand(String name, int year, List<MusicArtist> members) {
        this.name = name;
        this.year = year;
        this.members = members;
    }

    public void printMembers() {
        System.out.println("Состав группы " + this.getName() + ":");
        for (MusicArtist member : members) {
            System.out.println(member.getName() + " " + member.getAge());
        }
    }

    public static void transferMembers (MusicBand group1, MusicBand group2) {
        for (MusicArtist member: group1.getMembers()) {
            group2.members.add(member);
        }
        group1.members.clear();
    }

    public List<MusicArtist> getMembers() {
        return members;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }
}
