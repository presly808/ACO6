package ua.artcode.week5.serial;

/**
 * Created by serhii on 24.05.15.
 */
public class TestPilotSaving {

    public static final String PATH = "/home/serhii/IdeaProjects/ACO6/temp/pilot.txt";

    public static void main(String[] args) {
        PilotIOHelper pilotIOHelper = new PilotIOHelper();

        pilotIOHelper.save(PATH, new Pilot("Oleg", 10, 10000));

        pilotIOHelper.load(PATH);
    }
}
