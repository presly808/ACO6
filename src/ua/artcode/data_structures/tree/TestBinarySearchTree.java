package ua.artcode.data_structures.tree;

import java.util.Comparator;

/**
 * Created by serhii on 13.06.15.
 */
public class TestBinarySearchTree {


    public static void main(String[] args) {

        // Anonymous class
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        };


        BTree bTree = new BinarySearchTree(comparator);
        bTree.add(45);
        bTree.add(11);
        bTree.add(100);
        bTree.add(9);
        bTree.add(68);
        bTree.add(33);
        bTree.add(88);

        bTree.print();


    }
}
