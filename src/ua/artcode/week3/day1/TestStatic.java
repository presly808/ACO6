package ua.artcode.week3.day1;

/**
 * Created by master on 09.05.15.
 */
public class TestStatic {

    public static void main(String[] args) {

        Robot robot1 = new Robot(200, "INV");
        Robot robot2 = new Robot(140, "BB");
        Robot robot3 = new Robot(256, "JKL");

        System.out.println(robot1.getPowerUsage());
        System.out.println(robot3.getPowerUsage());
        System.out.println(robot2.getPowerUsage());

        Robot.setPowerUsage(450);

        Robot.showCount();
        System.out.println(robot3.getPowerUsage());
        System.out.println(robot1.getPowerUsage());
        System.out.println(robot2.getPowerUsage());


    }
}

class Robot {

    private static int count = 0;
    // depends on class, common for all objects
    private static int powerUsage = 220;

    private int power;
    private String model;

    public Robot() {
    }

    public Robot(String model) {
        this.model = model;
    }

    public Robot(int power) {
        this.power = power;
    }

    public Robot(int power, String model) {
        this.power = power;
        this.model = model;
    }

    // before  each constructor block
    {
        count++;
    }

    public static void showCount(){
        System.out.println(count);
    }

    public int getPowerUsage() {
        return powerUsage;
    }

    public static void setPowerUsage(int powerUsage){
        Robot.powerUsage = powerUsage;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public static void testStatic(){
        //this.power++;
    }

    public static void testNonStatic(){
        powerUsage++;
    }
}
