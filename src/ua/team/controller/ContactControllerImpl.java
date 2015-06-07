package ua.team.controller;

import ua.team.model.Contact;

import java.util.ArrayList;

/**
 * Created by serhii on 07.06.15.
 */
public class ContactControllerImpl implements IContactController{

    private ArrayList<Contact> contacts = new ArrayList<>();

    @Override
    public ArrayList<Contact> getAll() {
        return contacts;
    }

    @Override
    public void addNew(Contact contact) {
        contacts.add(contact);
    }

    @Override
    public void remove(String number) {
        Contact additionalForSearch = new Contact();
        additionalForSearch.setPhone(number);
        contacts.remove(additionalForSearch);
    }

    @Override
    public Contact search(String number) {
        return contacts.get(contacts.indexOf(new Contact(number)));
    }

    @Override
    public boolean update(Contact contact) {
        int position = contacts.indexOf(contact);// TODO how change number if number is identifier
        return false;
    }
}
