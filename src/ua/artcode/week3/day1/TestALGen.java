package ua.artcode.week3.day1;

import java.util.ArrayList;

/**
 * Created by serhii on 10.05.15.
 */
public class TestALGen {

    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add(34);
        al.add("vania");


        Object i = al.get(0);


        ArrayList<String> words = new ArrayList<String>();
        words.add("Vova");
        String s = words.get(0);

        ArrayList<ICup> cups = new ArrayList<>();

        cups.add(new ICup(250,"plastic",0.25));
        cups.add(new ICup(500,"aliminium",0.5));
        cups.add(new ICup(400, "none", 0.4));

        int index = cups.indexOf(new ICup(250,"plastic",0.25));
        System.out.println(index);

    }
}
