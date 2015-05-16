package ua.artcode.week4.convert_date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by serhii on 16.05.15.
 */
public class TestSmpleDateFormat {

    public static void main(String[] args) {

        try{
            System.out.println("in try");
            Date date = parseDate("1fgdfg.07.2013");
            System.out.println("after parse");
        } catch (ParseException e){
            // process exception, resolve problem,
            // and save my program
            // app is still running
            System.out.println("in catch");
            // know i get e(exception)
            System.out.println(e.getMessage());
        }

        System.out.println("after catch");

















    }

    public static Date parseDate(String date) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");

        Date parsed = sdf.parse(date);

        return parsed;

    }

}
