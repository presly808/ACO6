package ua.artcode.week1.day2;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by serhii on 19.04.15.
 */
public class TestArrays {

    public static void main(String[] args) {
        int[] mas = {1,2,3,4,5,6,7};
        int[] arr = {465,234,1,5,565,4};

        int[] copy = Arrays.copyOf(mas,20);
        String res = Arrays.toString(copy);
        System.out.println(res);


        System.out.println(Arrays.toString(Arrays.copyOfRange(arr, 1, 4))
                .replace(" ", "")
                .replace(",", "-")
                .replace("[", "(")
                .replace("]", ")"));


        String s = "some";


        System.arraycopy(mas,2,arr,6,4);
        System.out.println(Arrays.toString(arr));

    }



}
