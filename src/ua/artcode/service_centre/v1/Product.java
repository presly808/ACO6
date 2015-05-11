package ua.artcode.service_centre.v1;

/**
 * Created by serhii on 14.03.15.
 */
public class Product {

    private String model;
    private double price;
    private boolean fixed;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isFixed() {
        return fixed;
    }

    public void setFixed(boolean fixed) {
        this.fixed = fixed;
    }
}
