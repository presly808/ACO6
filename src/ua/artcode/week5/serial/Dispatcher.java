package ua.artcode.week5.serial;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by serhii on 24.05.15.
 */
public class Dispatcher implements Serializable { // ala Container

    private ArrayList<Airplane> airplanes = new ArrayList<>();
    private ArrayList<Pilot> pilots = new ArrayList<>();

    public void addPilot(Pilot pilot){
        pilots.add(pilot);
    }

    public void addAirplane(Airplane airplane){
        airplanes.add(airplane);
    }

}
