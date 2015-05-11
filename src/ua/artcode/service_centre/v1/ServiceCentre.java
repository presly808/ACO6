package ua.artcode.service_centre.v1;

import java.util.ArrayList;

/**
 * Created by serhii on 14.03.15.
 */
public class ServiceCentre {

    private double amount;
    private Director director;
    private Admin admin;
    private ArrayList<Specialist> specialists;

    public ServiceCentre() {
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public Admin getAdmin() {
        return admin;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }

    public ArrayList<Specialist> getSpecialists() {
        return specialists;
    }

    public void setSpecialists(ArrayList<Specialist> specialists) {
        this.specialists = specialists;
    }
}
