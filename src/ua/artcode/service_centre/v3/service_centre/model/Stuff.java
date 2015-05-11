package ua.artcode.service_centre.v3.service_centre.model;

/**
 * Created by tokar on 30.04.2015.
 */
public class Stuff  {
    private String name;
    private String surname;
    private String post;
    private double salary;


    public Stuff() {
    }

    public Stuff(String name, String surname, String post, double salary) {
        this.name = name;
        this.surname = surname;
        this.post = post;
        this.salary = salary;

    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPost() {
        return post;
    }

    public double getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String toString(){
        //return String.format("name : %s, surname : %s, post : %�, salary: = %.3f\n", name, surname,post);
        return String.format("name : %s, surname: %s, post : %s, salary: %.2f\n",name,surname,post,salary);
    }



}
