package ua.artcode.week2.day1.inheritance;


import java.util.Date;

public class WorkContact extends GeneralContact {

    private String position;
    private String company;
    private double salary;

    public WorkContact(String name, String number,
                       int age, String position,
                       String company, double salary) {
        super(name, number, age);
        this.position = position;
        this.company = company;
        this.salary = salary;
    }

    public WorkContact(String position, String company, double salary){
        super("Default","+3434",34);
        this.position = position;
        this.company = company;
        this.salary = salary;
    }


    public void sendDinnerInvite(Date date){
        System.out.printf("Im waiting for you at %1$tH:%1$tM\n", date);
    }


    public void sayHello(){
        System.out.printf("Work contact position %s, company %s, %.3f\n",
                position,company,salary);
    }

}
