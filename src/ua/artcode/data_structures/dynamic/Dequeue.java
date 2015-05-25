package ua.artcode.data_structures.dynamic;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Dequeue<T> implements IDequeue<T>, Iterable<T>{

    private Node<T> head;
    private Node<T> tail;
    private int size = 0;


    @Override
    public void addFirst(T el) {

    }

    @Override
    public T getLast() {
        return null;
    }

    @Override
    public void addLast(T last) {
        if(size == 0){
            Node<T> newNode = new Node<>(last, null,null);
            head = newNode;
            tail = newNode;
            size++;
        } else {
            Node<T> newNode = new Node<>(last, tail, null);
            tail.next = newNode;
            tail = newNode;
        }

    }

    @Override
    public T getFirst() {
        if(size == 0){
            throw new NoSuchElementException("empty dequeue");
        }

        T ret = head.value;

        // 1-2-3-4
        // h     t

        head = head.next;
        head.prev = null;

        return ret;
    }

    @Override
    public Dequeue<T> clone() {
        Dequeue<T> clone = new Dequeue<>();
        for(T el : this){
            clone.addLast(el); // not deep/
        }

        return clone;
    }

    private static class Node<V> {

        V value;
        Node<V> prev;
        Node<V> next;
        public Node(V value, Node<V> prev, Node<V> next) {
            this.value = value;
            this.prev = prev;
            this.next = next;
        }

    }

    @Override
    public Iterator<T> iterator() {
        return new DequeueIterator();
    }

    private class DequeueIterator implements Iterator<T> {

        private Node<T> curr = head;

        @Override
        public boolean hasNext() {
            return curr != null;
        }

        @Override
        public T next() {
            T ret = curr.value;
            curr = curr.next;
            return ret;
        }

        @Override
        public void remove() {

        }
    }

}
