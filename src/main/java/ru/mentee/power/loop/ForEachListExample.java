package ru.mentee.power.loop;

import java.util.ArrayList;
import java.util.List;

public class ForEachListExample {
    public static void main(String[] args) {

        List<String> list = new ArrayList<String>();
        list.add("A");
        list.add("B");
        list.add("C");

        for (String s : list) {
            System.out.println(s);
        }
    }
}
