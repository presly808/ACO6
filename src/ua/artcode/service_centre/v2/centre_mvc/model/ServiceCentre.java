package ua.artcode.service_centre.v2.centre_mvc.model;

import java.util.ArrayList;


public class ServiceCentre {

    private double money;
    private ArrayList<Spec> specs = new ArrayList<>();
    private ArrayList<Ticket> tickets = new ArrayList<>();

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public ArrayList<Spec> getSpecs() {
        return specs;
    }

    public void setSpecs(ArrayList<Spec> specs) {
        this.specs = specs;
    }

    public ArrayList<Ticket> getTickets() {
        return tickets;
    }

    public void setTickets(ArrayList<Ticket> tickets) {
        this.tickets = tickets;
    }
}
