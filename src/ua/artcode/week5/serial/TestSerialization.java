package ua.artcode.week5.serial;

/**
 * Created by serhii on 24.05.15.
 */
public class TestSerialization {

    public static final String PATH = "/home/serhii/IdeaProjects/ACO6/temp/airplane.out";

    // C:/dev/temp

    public static void main(String[] args) {
        Airplane airplane = new Airplane("AN-75", 800, 40000000);
        System.out.println(airplane);
        IOHelper<Airplane> helper = new IOHelperSerial<>();
        helper.save(PATH, airplane);


        Airplane loaded = helper.load(PATH);
        System.out.println(loaded);
    }
}
