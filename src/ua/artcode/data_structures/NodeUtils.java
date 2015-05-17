package ua.artcode.data_structures;

/**
 * Created by serhii on 17.05.15.
 */
public class NodeUtils {

    public static void print(Node curr){
        while(curr != null){
            System.out.println(curr.getValue());
            curr = curr.getNext();
        }
    }

    public static Node generate(int[] mas){
        return null;
    }

}
