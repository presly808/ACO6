package ua.artcode.week4.ex;

/**
 * Created by serhii on 16.05.15.
 */
public class TestUncheckedEx {


    public static void main(String[] args) {


    }

    public static void nullPointer(){
        String s = null;
        s.length();
        System.out.println("after");
    }

    public static void indexOut(){
        int[] mas = new int[10];
        int res = mas[-1];
    }

}
