package ua.artcode.data_structures.dynamic;


public interface IDequeue<E> extends IQueue<E> {

    void addFirst(E el);

    E getLast();

}
