package ua.artcode.week3.day2;

import java.io.ObjectStreamException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by serhii on 10.05.15.
 */
public class MyComparatorTest {


    public static void main(String[] args) {
        Comparator comparator = new ContactAgeComparator();



        ContactContainer container = new ContactContainer();
        container.addContact(new SimpleContact("Lev",23,1200));
        container.addContact(new SimpleContact("Andrey",40,1200));
        container.addContact(new SimpleContact("Oleg",30,3400));
        container.addContact(new SimpleContact("Lev",19,2900));

        container.showAllByName();
        System.out.println("*********************");
        container.showAllByAge();
        System.out.println("*********************");
        container.showAllBySalary();
        System.out.println("*********************");

    }

    public static void testCastComparable(Object o){
        // SipleContact is-a Comparable
        Comparable comparable = (Comparable) o;
    }

}

class ContactContainer {

    private ArrayList<SimpleContact> contacts = new ArrayList<>();

    public void addContact(SimpleContact simpleContact){
        contacts.add(simpleContact);
    }

    public void showAllByName(){
        generalSortAndPrint(new ContactNameComparator());
    }

    public void showAllByAge(){
        generalSortAndPrint(new ContactAgeComparator());
    }

    public void showAllBySalary(){
        generalSortAndPrint(new ContactSalaryComparator());
    }

    private void generalSortAndPrint(Comparator comparator) {
        SimpleContact[] simpleContacts =
                new SimpleContact[contacts.size()];
        contacts.toArray(simpleContacts);

        Arrays.sort(simpleContacts, comparator);
        for(int i = 0; i < simpleContacts.length; i++){
            System.out.println(simpleContacts[i]);
        }
    }

}



class SimpleContact implements Comparable {

    private String name;
    private int age;
    private double salary;

    public SimpleContact(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "SimpleContact{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        SimpleContact simpleContact = (SimpleContact) o;
        return this.age - simpleContact.age;
    }
}

class ContactNameComparator implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        SimpleContact c1 = (SimpleContact) o1;
        SimpleContact c2 = (SimpleContact) o2;
        return c1.getName().compareTo(c2.getName());
    }
}

class ContactSalaryComparator implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        SimpleContact c1 = (SimpleContact) o1;
        SimpleContact c2 = (SimpleContact) o2;
        return (int) (c1.getSalary() - c2.getSalary());
    }
}

class ContactAgeComparator implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        SimpleContact c1 = (SimpleContact) o1;
        SimpleContact c2 = (SimpleContact) o2;
        return c1.getAge() - c2.getAge();
    }
}
