package ua.artcode.week5.serial;

import java.io.Serializable;

public class Airplane implements Serializable {

    private String model;
    private int speed;
    private double price;

    public Airplane() {
    }

    public Airplane(String model, int speed, double price) {
        this.model = model;
        this.speed = speed;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Airplane{" +
                "model='" + model + '\'' +
                ", speed=" + speed +
                ", price=" + price +
                '}';
    }
}
