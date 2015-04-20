package ua.artcode.week1.day2;

/**
 * Created by serhii on 19.04.15.
 */
public class MyString {


    private char[] mas;

    public MyString() {
        mas = new char[0];
    }

    public MyString(char[] mas) {
        this.mas = mas;
    }

    public MyString concat(MyString in){

        int masLength = mas.length;
        int inMaslength = in.mas.length;

        char[] res = new char[masLength + inMaslength];

        System.arraycopy(mas,0,res,0,masLength);
        System.arraycopy(in.mas,0,res,masLength,inMaslength);

        return new MyString(res);
    }
}
