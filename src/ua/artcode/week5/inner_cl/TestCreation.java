package ua.artcode.week5.inner_cl;

import java.util.ArrayList;

/**
 * Created by serhii on 23.05.15.
 */
public class TestCreation {

    public static void main(String[] args) {
        Flat flat = new Flat();
        Flat.Room room = flat.new Room("", 23, 14000);

        Flat.Window window = new Flat.Window();

        ArrayList al = new ArrayList();
    }
}
