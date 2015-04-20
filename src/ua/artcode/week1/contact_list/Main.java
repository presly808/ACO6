package ua.artcode.week1.contact_list;

public class Main {

    // Shift + Ctrl + F10
    // start point
    public static void main(String[] args) {
        // new String()
        // new Scanner()
        Contact contact1 = new Contact();
        //create reference = create object;
        /*contact1.name = "Kolia";
        contact1.age = 24;
        contact1.phone = "+38 093 23 23 456";*/
        contact1.initContact("Kolia","+38 093 23 23 456",24);
        contact1.showContact();


        Contact contact2 = new Contact();
        contact2.initContact("Oleg","+38 093 23 23 456",24);
        //create reference = create object;
        /*contact2.name = "Vasia"3
        contact2.age = 23;
        contact2.phone = "+38 056 55 23 456";*/
        contact2.showContact();
        // Contact.showContact();

    }

}
