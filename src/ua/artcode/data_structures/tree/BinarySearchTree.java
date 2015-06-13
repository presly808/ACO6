package ua.artcode.data_structures.tree;

import java.util.Comparator;

/**
 * Created by serhii on 13.06.15.
 */
public class BinarySearchTree implements BTree {

    private TreeNode root;
    private Comparator comparator;

    public BinarySearchTree(Comparator comparator) {
        this.comparator = comparator;
    }

    @Override
    public boolean add(Object el) {
        if (root == null) {
            root = new TreeNode(null, el, null, null);
            return true;
        } else {
            TreeNode iter = root;
            while(iter != null){
                if(comparator.compare(el,iter.value) > 0){
                    if(iter.rChild == null){
                        iter.rChild = new TreeNode(iter,el,null,null);
                        return true;
                    } else {
                        iter = iter.rChild;
                    }
                } else if(comparator.compare(el,iter.value) < 0){
                    if(iter.lChild == null){
                        iter.lChild = new TreeNode(iter,el,null,null);
                        return true;
                    } else {
                        iter = iter.lChild;
                    }
                } else {
                    // if el already in tree
                    return false;
                }
            }
        }
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public boolean remove(Object el) {
        return false;
    }

    @Override
    public void print() {
        traverse(root);
    }

    private void traverse(TreeNode node){

        if(node == null){
            return;
        }

        traverse(node.lChild);
        System.out.println(node.value);
        traverse(node.rChild);
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }


    private class TreeNode {

        TreeNode parent;
        Object value;
        TreeNode lChild;
        TreeNode rChild;

        public TreeNode() {
        }

        public TreeNode(TreeNode parent, Object value,
                        TreeNode lChild, TreeNode rChild) {
            this.parent = parent;
            this.value = value;
            this.lChild = lChild;
            this.rChild = rChild;
        }
    }

}
