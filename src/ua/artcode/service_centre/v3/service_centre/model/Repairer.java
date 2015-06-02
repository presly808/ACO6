package ua.artcode.service_centre.v3.service_centre.model;

/**
 * Created by tokar on 01.05.2015.
 */
public class Repairer extends Stuff {

    private transient RepairerType type = RepairerType.JUNIOR;

    public Repairer() {
    }

    public Repairer(String name, String surname, String post, double salary) {
        super(name, surname, post, salary);
    }


}
