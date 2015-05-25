package ua.artcode.data_structures.iter;

import ua.artcode.data_structures.ArrayStack;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by serhii on 24.05.15.
 */
public class ArrayStackIterTest {

    public static void main(String[] args) {
        ArrayStack as = new ArrayStack();
        as.push(1);
        as.push(2);
        as.push(3);
        as.push(4);

        Iterator iter = as.iterator();
        //iter.forEachRemaining(System.out::println);
        while(iter.hasNext()){
            System.out.println(iter.next());
        }

        System.out.println("***********for-each ArrayStack");
        for(Object o : as){
            System.out.println(o);
        }

        System.out.println("***********for-each arrayList");
        ArrayList al = new ArrayList();
        al.add(1);
        al.add(2);
        al.add(3);

        for(Object o : al){ // for each = iterator
            System.out.println(o);
        }

    }

}
