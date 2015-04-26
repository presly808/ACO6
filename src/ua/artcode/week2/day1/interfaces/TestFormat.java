package ua.artcode.week2.day1.interfaces;

/**
 * Created by serhii on 26.04.15.
 */
public class TestFormat {

    public static void main(String[] args) {
        Dog dog = new Dog(5,"Sharic");
        Person person = new Person("+38093323232", 1500);

        MyFormatter formatter = new MyFormatter();
        formatter.printf(dog);
    }





}


interface Formattable {

    public String format();

}

class MyFormatter{

    public void printf(Formattable f){
        System.out.println(f.format());
    }

}

class Dog implements Formattable {

    private int age;
    private String name;

    public Dog(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public String format() {
        return "DOG{age = " + age + ",name = " + name + "}";
    }
}

class Person {

    private String number;
    private double salary;

    public Person(String number, double salary) {
        this.number = number;
        this.salary = salary;
    }


}
