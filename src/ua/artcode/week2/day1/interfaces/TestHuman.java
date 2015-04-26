package ua.artcode.week2.day1.interfaces;

/**
 * Created by serhii on 26.04.15.
 */
public class TestHuman {


    public static void main(String[] args) {
        HumanBehavior behavior = new Human();
        behavior.go();

        RacerBehavior racer = new Human();
        racer.race();
    }



}
