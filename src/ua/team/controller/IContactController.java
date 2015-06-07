package ua.team.controller;

import ua.team.model.Contact;

import java.util.ArrayList;

public interface IContactController {

    ArrayList<Contact> getAll();
    void addNew(Contact contact);
    void remove(String number);
    Contact search(String number);
    boolean update(Contact contact);

}
