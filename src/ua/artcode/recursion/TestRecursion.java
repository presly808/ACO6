package ua.artcode.recursion;

/**
 * Created by serhii on 17.05.15.
 */
public class TestRecursion {

    public static void main(String[] args) {
        System.out.println(fact(5));
        System.out.println(fibb(7));
    }


    public static void rec(int num){
        // exit condition
        if(num == 10) {
            return;
        }

        rec(num + 1); // open new method , recursion call
    }

    public static int fibb(int pos){

        if(pos < 2){
            return 1;
        }

        return fibb(pos-1) + fibb(pos-2);

    }

    public static int fact(int num){
        if(num == 0 || num == 1){
            return 1;
        }

        //recursion
        int prevRes = fact(num - 1);

        // current method work
        int res = num * prevRes;

        return res;
    }


}
