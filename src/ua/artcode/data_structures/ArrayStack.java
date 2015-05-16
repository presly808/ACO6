package ua.artcode.data_structures;

/**
 * Created by serhii on 16.05.15.
 */
public class ArrayStack implements IStack {

    private Object[] mas;
    private int index = 0;

    public ArrayStack() {
        mas = new Object[10];
    }

    @Override
    public void push(Object el) {
        mas[index] = el;
        index++;
    }

    @Override
    public Object pop() {
        if(index == 0){
            throw new StackEmptyException("stack is empty");
        }
        Object ret = mas[--index]; // change index and save element
        mas[index] = null; //remove from mas
        return ret;
    }
}
