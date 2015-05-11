package ua.artcode.service_centre.v2.centre_mvc.model;

import java.util.ArrayList;


public class Client {

    private String name;
    private double money;
    private ArrayList<Product> products = new ArrayList<Product>();

    public Client() {
    }

    public Client(String name, double money) {
        this.name = name;
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }
}
