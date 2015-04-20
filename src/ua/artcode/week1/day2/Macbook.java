package ua.artcode.week1.day2;

/**
 * Created by serhii on 19.04.15.
 */
public class Macbook {

    private int ddr;
    private int hdd;
    private double diagonal;
    private String cpu;

    public Macbook(){
        ddr = 2048;
        hdd = 512;
        diagonal = 14;
        cpu = "core i5";
    }

    public Macbook(int ddr, int hdd,
                   double diagonal, String cpu){
        this.ddr = ddr;
        this.hdd = hdd;
        this.diagonal = diagonal;
        this.cpu = cpu;
    }

    public void start(){
        System.out.println("Have a fun, unlimited time");
    }

    public void start(int hour){
        System.out.println("Run for children! estimation time " + hour + " hours");
    }




}
