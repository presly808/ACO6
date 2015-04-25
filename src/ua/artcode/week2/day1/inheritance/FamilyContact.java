package ua.artcode.week2.day1.inheritance;

/**
 * Created by serhii on 25.04.15.
 */
public class FamilyContact extends GeneralContact {

    private String desc;
    private String address;

    public FamilyContact(String name, String number, int age,
                         String desc, String address) {
        super(name, number, age);
        this.desc = desc;
        this.address = address;
    }

    public void visitFamilyMember() {
        System.out.printf("visit method");
    }

    // overriding
    public void sayHello(){
        System.out.printf("Family member %s, address %s\n", desc, address);
    }


}