package ua.artcode.week5.serial;

import java.io.Serializable;

/**
 * Created by serhii on 24.05.15.
 */
public class Pilot implements Serializable {

    private String name;
    private int experience;
    private double salary;

    public Pilot() {
    }

    public Pilot(String name, int experience, double salary) {
        this.name = name;
        this.experience = experience;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Pilot{" +
                "name='" + name + '\'' +
                ", experience=" + experience +
                ", salary=" + salary +
                '}';
    }
}
