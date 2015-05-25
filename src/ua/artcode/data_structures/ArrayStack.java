package ua.artcode.data_structures;

import java.util.Iterator;

/**
 * Created by serhii on 16.05.15.
 */
public class ArrayStack implements IStack {

    private Object[] mas;
    private int size = 0;

    public ArrayStack() {
        mas = new Object[10];
    }

    @Override
    public void push(Object el) {
        mas[size] = el;
        size++;
    }

    @Override
    public Object pop() {
        if(size == 0){
            throw new StackEmptyException("stack is empty");
        }
        Object ret = mas[--size]; // change size and save element
        mas[size] = null; //remove from mas
        return ret;
    }

    @Override
    public Iterator iterator() {
        return new ArrayStackIterator();
    }

    private class ArrayStackIterator implements Iterator {

        private int position = 0;

        @Override
        public boolean hasNext() {
            return position < size;
        }

        @Override
        public Object next() {
            Object ret = mas[position];
            position++;
            return ret;
        }

        @Override
        public void remove() {
            //throw new Operat
        }


    }
}
