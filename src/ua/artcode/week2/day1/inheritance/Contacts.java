package ua.artcode.week2.day1.inheritance;

/**
 * Created by serhii on 25.04.15.
 */
public class Contacts {

    private GeneralContact[] list;
    private int index;

    public Contacts() {
        list = new GeneralContact[10];
    }

    public void add(GeneralContact generalContact){
        list[index] = generalContact;
        index++;
    }

    public GeneralContact getLast(){
        return list[index-1];
    }

    public void showAll(){
        for (int i = 0; i < index; i++) {
            GeneralContact generalContact = list[i];
            generalContact.sayHello();
        }
    }


}
