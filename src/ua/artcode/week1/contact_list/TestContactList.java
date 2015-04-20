package ua.artcode.week1.contact_list;


import ua.artcode.week1.contact_list.ContactList;

public class TestContactList {

    public static void main(String[] args) {
        ContactList contactList = new ContactList();

        contactList.addContact("Andrey","+3009309",23);
        contactList.addContact("Kolia","+30037377",60);
        contactList.addContact("Andrey","+365273",44);
        contactList.addContact("Andrey","+32323",12);

        contactList.showAll();
    }
}
