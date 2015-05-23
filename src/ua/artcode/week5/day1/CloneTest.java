package ua.artcode.week5.day1;

import java.util.Date;

public class CloneTest {
    public static void main(String[] args) {
        Dog dog = new Dog("Sharik", 2, 60, new Date());
        System.out.println("source " + dog);
        Dog clone = dog.clone();
        System.out.println("cloned " + clone);
    }
}

class Dog implements Cloneable, Comparable<Dog> {

    private String name;
    private int age;
    private double weight;
    private Date birthday;

    public Dog() {
    }

    public Dog(String name, int age,
               double weight, Date birthday) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.birthday = birthday;
    }


    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", birthday=" + birthday +
                '}';
    }

    @Override
    public Dog clone() {
        Dog dog = null;
        try {
            dog = (Dog) super.clone();
            dog.name = new String(this.name); // reference object cloning
            dog.birthday = (Date) this.birthday.clone(); // reference object cloning
        } catch (CloneNotSupportedException e) {
            throw new UnsupportedOperationException("cant clone Dog");
        }

        return dog;
    }

    @Override
    public int compareTo(Dog o) {
        return 0;
    }
}



