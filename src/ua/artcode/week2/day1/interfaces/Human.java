package ua.artcode.week2.day1.interfaces;

// implements  = is-a
public class Human implements HumanBehavior, RacerBehavior {

    public void eat(String food){
        System.out.println("eat " + food);
    }

    public void go(){
        System.out.println("Human go");
    }

    public boolean race(){
        System.out.println("human race method");
        return true;
    }

}
