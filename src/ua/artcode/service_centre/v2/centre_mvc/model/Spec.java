package ua.artcode.service_centre.v2.centre_mvc.model;

import java.util.ArrayList;


public class Spec {

    private String name;
    private double salary;
    private ArrayList<Product> products = new ArrayList<Product>();

    public Spec() {
    }

    public Spec(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }
}
