package ua.artcode.week2.day1.inheritance;

import ua.artcode.week1.contact_list.Contact;

import java.util.Date;

/**
 * Created by serhii on 25.04.15.
 */
public class TestAbstraction {

    public static void main(String[] args) {
        // reference
        GeneralContact contact =
                new FamilyContact("Vasia","_sdfsd",40,"uncle","gonchariv");
                // object
        contact.sayHello();

        FamilyContact familyContact =
                new FamilyContact("Galia","sdf",50,"Aunt","Tomashivka");

        WorkContact workContact =
                new WorkContact("Ivan","num",30,"qa","kievstar",2000);


        Contacts contacts = new Contacts();
        contacts.add(familyContact);
        contacts.add(contact);
        contacts.add(workContact);
        contacts.add(new TravelContact("John","sdf",34,"New York",new Date()));

        contacts.showAll();

    }
}
