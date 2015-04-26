package ua.artcode.algo;

/**
 * Created by serhii on 26.04.15.
 */
public class Robot implements Comparable {

    private int power;
    private String model;
    private double price;

    public Robot(int power, String model, double price) {
        this.power = power;
        this.model = model;
        this.price = price;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

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

    @Override
    public int compareTo(Object o) {
        // casting
        Robot other = (Robot) o;
        if(this.price < other.price){
            return -1;
        } else if(this.price > other.price){
            return 1;
        }

        return 0;
    }

    @Override
    public String toString() {
        return String.format("model: %s, power: %d, price: %.4f\n", model,power,price);
    }
}
