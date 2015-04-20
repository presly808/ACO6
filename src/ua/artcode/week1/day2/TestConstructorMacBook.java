package ua.artcode.week1.day2;

/**
 * Created by serhii on 19.04.15.
 */
public class TestConstructorMacBook {

    public static void main(String[] args) {
        Macbook macbook = new Macbook(6000, 100000, 17,"intel i7");
        macbook.start();
        macbook.start(2);
    }
}
