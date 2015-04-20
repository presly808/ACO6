package ua.artcode.week1.contact_list;

public class ContactList {

    private int size; // 0
    private Contact[] contacts = new Contact[10]; // null

    public void addContact(String name, String phone, int age){
        if(size >= contacts.length){
            resizeArr();
        }

        Contact newContact = new Contact(); // call constructor
        newContact.initContact(name,phone,age);
        contacts[size] = newContact;
        size++;
    }

    private void resizeArr() {
        Contact[] mas = new Contact[size * 2];
        for (int i = 0; i < size; i++) {
            mas[i] = contacts[i];
        }
        contacts = mas;
    }

    public void showAll(){
        for (int i = 0; i < size; i++) {
            contacts[i].showContact();
        }
    }



    public int getSize(){
        return size;
    }


}
