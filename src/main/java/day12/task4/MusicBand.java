package day12.task4;

import java.util.ArrayList;
import java.util.List;

public class MusicBand {
    private String name;
    private int year;
    private List<String> members = new ArrayList<String>();


    public MusicBand(String name, int year, List<String> members) {
        this.name = name;
        this.year = year;
        this.members = members;
    }

    public void printMembers() {
        System.out.println("Состав группы " + this.getName() + ":");
        for (String member : members) {
            System.out.println(member);
        }
    }

    public static void transferMembers (MusicBand group1, MusicBand group2) {
        for (String member: group1.getMembers()) {
            group2.members.add(member);
        }
        group1.members.clear();
    }

    public List<String> getMembers() {
        return members;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }
}
