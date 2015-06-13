package ua.artcode.data_structures.tree;

/**
 * Created by serhii on 13.06.15.
 */
public interface BTree<E> {

    boolean add(E el);
    boolean contains(Object o);
    boolean remove(E el);
    void print();
    E[] toArray();

}
