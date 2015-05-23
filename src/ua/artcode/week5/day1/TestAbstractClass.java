package ua.artcode.week5.day1;

/**
 * Created by serhii on 23.05.15.
 */
public class TestAbstractClass {
    public static void main(String[] args) {
        Worker worker = new Coder();

    }


}

abstract class Worker {

    private int age;
    private String name;

    public Worker() {
    }

    public Worker(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public void sayHello(){
        System.out.println(name + " " + age);
    }

    public abstract void work();
}

class Coder extends Worker {

    @Override
    public void work() {
        System.out.println("Coding");
    }
}
