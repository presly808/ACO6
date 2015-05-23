package ua.artcode.data_structures;

public class Dequeue<T> implements IDequeue<T>{

    private Node<T> head;
    private Node<T> tail;
    private int size = 0;


    @Override
    public void addFirst(T el) {
        if(size == 0){
            Node<T> newNode = new Node<>(el, null,null);
            head = newNode;
            tail = newNode;
            size++;
        } else {
            Node<T> newNode = new Node<>(el, tail, null);
            tail.next = newNode;
            tail = newNode;
        }


    }

    @Override
    public T getLast() {
        return null;
    }

    @Override
    public void addLast(T last) {

    }

    @Override
    public T getFirst() {
        return null;
    }

    private static class Node<V> {
        V value;
        Node prev;
        Node next;

        public Node(V value, Node prev, Node next) {
            this.value = value;
            this.prev = prev;
            this.next = next;
        }
    }

}
