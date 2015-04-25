package ua.artcode.week2.day1.inheritance;

public class GeneralContact {

    private String name;
    private String number;
    private int age;

    public GeneralContact() {
    }

    public GeneralContact(String name, String number, int age) {
        this.name = name;
        this.number = number;
        this.age = age;
    }

    public void sayHello(){
        System.out.printf("name : %s, age : %d, number : %s\n", name,age,number);
    }
}
