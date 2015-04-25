package ua.artcode.week2.day1.inheritance;

import java.util.Date;

/**
 * Created by serhii on 25.04.15.
 */
public class TestCreationInheritance {

    public static void main(String[] args) {
        FamilyContact familyContact =
                new FamilyContact("Galia","sdf",50,"Aunt","Tomashivka");

        familyContact.sayHello();
        familyContact.visitFamilyMember();

        WorkContact workContact =
                new WorkContact("Ivan","num",30,"qa","kievstar",2000);

        workContact.sendDinnerInvite(new Date()); // todo pass past date
        workContact.sayHello();
    }


}
