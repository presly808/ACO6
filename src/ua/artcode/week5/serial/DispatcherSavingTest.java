package ua.artcode.week5.serial;

/**
 * Created by serhii on 24.05.15.
 */
public class DispatcherSavingTest {

    public static final String PATH = "/home/serhii/IdeaProjects/ACO6/temp/dispatcher";

    public static void main(String[] args) {
        Dispatcher dispatcher = new Dispatcher();
        dispatcher.addAirplane(new Airplane("JJ-54", 1000, 3456));
        dispatcher.addAirplane(new Airplane("KL-33", 3000, 2354));
        dispatcher.addAirplane(new Airplane("MM-54", 2000, 1221));


        dispatcher.addPilot(new Pilot("Vania", 10, 10000));
        dispatcher.addPilot(new Pilot("Vasia", 20, 20000));

        IOHelper ioHelper = new IOHelperSerial<>();
        ioHelper.save(PATH, dispatcher);

        Dispatcher dispatcher1 = (Dispatcher) ioHelper.load(PATH);
    }

}
