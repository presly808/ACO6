package ua.artcode.week2;

import ua.artcode.week1.contact_list.Contact;
import ua.artcode.week1.contact_list.ContactList;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Contact contact = new Contact();
        ContactList contactList =
                new ContactList();
        //contact.name = "sdf";

        char[] chars = new char[10];
        int code = chars[0];
        System.out.println(code);
        System.out.println("word" + '\u0009' +"second");
        System.out.println(Arrays.toString(chars));

    }
}
