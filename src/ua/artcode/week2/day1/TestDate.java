package ua.artcode.week2.day1;

import java.util.Date;

public class TestDate {


    public static void main(String[] args) {
        Date date = new Date();//

        System.out.println(date);

        long millisDate = date.getTime();
        System.out.println(millisDate);

        long millisSystem = System.currentTimeMillis();
        System.out.println(millisSystem);


    }
}
