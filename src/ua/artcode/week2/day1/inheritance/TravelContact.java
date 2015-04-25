package ua.artcode.week2.day1.inheritance;

import java.util.Date;

/**
 * Created by serhii on 25.04.15.
 */
public class TravelContact extends GeneralContact {

    private String city;
    private Date meetDate;

    public TravelContact(String name, String number, int age,
                         String city, Date meetDate) {
        super(name, number, age);
        this.city = city;
        this.meetDate = meetDate;
    }

    public void sayHello(){
        System.out.println(toString());
    }

    public String toString(){
        return String.format("city : %s, date : %tc", city,meetDate);
    }
}
