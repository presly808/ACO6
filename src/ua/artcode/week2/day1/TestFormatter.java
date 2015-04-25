package ua.artcode.week2.day1;

import java.util.*;
/**
 * Created by serhii on 25.04.15.
 */
public class TestFormatter {

    public static void main(String[] args) {
        String name = "Valera";
        int age = 56;
        double sarary = Math.random() * 1000;
        Date date = new Date();

        System.out.printf("name : %s, age : %d, salary : %.3f, date : %tc\n",
                name, age, sarary, date);

        String formattedString = String.format(
                "name : %s, age : %d, salary : %.3f, date : %4$tm-%4$td-%4$tY",
                name, age, sarary, date);
        System.out.println(formattedString);
    }
}
