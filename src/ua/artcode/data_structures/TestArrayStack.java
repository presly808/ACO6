package ua.artcode.data_structures;

/**
 * Created by serhii on 16.05.15.
 */
public class TestArrayStack {

    public static void main(String[] args) {
        IStack stack = new ArrayStack();
        stack.push("oleg");
        stack.push("ivan");
        stack.push("bogdan");


        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

    }
}
