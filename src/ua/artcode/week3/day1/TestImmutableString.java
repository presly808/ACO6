package ua.artcode.week3.day1;

/**
 * Created by master on 09.05.15.
 */
public class TestImmutableString {

    public static void main(String[] args) {
        String s = "";// new String("");
        for (int i = 0; i < 10000; i++) {
            s = s + "*";
        }

        System.out.println(s);



    }
}
