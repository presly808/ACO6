package ua.artcode.week3.day1;

import java.util.ArrayList;

/**
 * Created by master on 09.05.15.
 */
public class TestArrayList {

    public static void main(String[] args) {
        ArrayList al = new ArrayList();

        al.add("Oleg");
        al.add(45);
        al.add(0,"Vasia"); // v 300 45
        al.set(1, 300);

        //Object o = al.get(6);

        Object o1 = al.get(al.size() - 1);
        System.out.println(o1);

        //al.contains()













    }
}
