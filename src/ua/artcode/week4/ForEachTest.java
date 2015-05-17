package ua.artcode.week4;

import java.util.ArrayList;

/**
 * Created by serhii on 17.05.15.
 */
public class ForEachTest {


    public static void main(String[] args) {
        int[] mas = {1,2,3,4,5,6};

        for(int val : mas){
            System.out.print(val + " ");
        }
        System.out.println();

        String[] names = {"Ivan","Yuriy","Oleg"};
        for (String name : names){
            System.out.println(name);
        }


        ArrayList<Integer> nums = new ArrayList<>();
        for(Integer num : nums){
            System.out.println(num);
        }


    }
}
