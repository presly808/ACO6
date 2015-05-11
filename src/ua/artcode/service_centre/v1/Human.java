package ua.artcode.service_centre.v1;

/**
 * Created by serhii on 14.03.15.
 */
public abstract class Human {

    private String name;
    private int age;
    private double cash;

    public Human() {
    }

    public Human(String name, int age, double cash) {
        this.name = name;
        this.age = age;
        this.cash = cash;
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

    public double getCash() {
        return cash;
    }

    public void setCash(double cash) {
        this.cash = cash;
    }
}
