package ua.artcode.data_structures;

import java.util.Arrays;

/**
 * Created by serhii on 14.03.15.
 */
public class NodeHelper implements INodeHelper {

    public void addToTail(Node first,Object val){
        // find last
        Node iter = first;
        while (iter.getNext() != null){
            iter = iter.getNext();
        }
        // create new node
        Node newNode = new Node(val, null);
        // link new node to end
        iter.setNext(newNode);

    }

    @Override
    public void addToTail1(Node head, Object val) {

    }

    @Override
    public void addToTail2(Node tail, Object val) {

    }

    public Node addToHead(Node chain ,Object val){

        return new Node(val, chain);
    }

    public String toString(Node chain){
        return chain.getNext() != null ?
                chain.getValue() + "->" + toString(chain.getNext()) : chain.getValue().toString();
    }

    // 1,2,3,4,5
    public Node createNode(Object...mas){

        if(mas.length < 1) return null;

        Node node = new Node(mas[0]);

        Object[] newMasForStep = Arrays.copyOfRange(mas, 1, mas.length);

        Node returnedNode = createNode(newMasForStep);

        node.setNext(returnedNode);

        return node;
    }

    public Node createNodeR(Object...mas){
        return mas.length < 1 ? null :
                new Node(mas[0],
                        createNodeR(Arrays.copyOfRange(mas, 1, mas.length)));
    }

    public int count(Node chain){
        return chain == null ? 0 : 1 + count(chain.getNext());
    }

    public Node remove(Node chain, Object val){
        return chain;
    }

    public  Object[] toArray(Node chain){
        return null;
    }

    public Node reverse(Node curr){

        Node next = null;
        Node prev = null;

        while(curr != null){
            next = curr.getNext();
            curr.setNext(prev);
            prev = curr;
            curr = next;
        }

        return prev;
    }

    public Node reverse(Node curr, Node next, Node prev){
        if(curr == null){
            return prev;
        }

        next = curr.getNext();
        curr.setNext(prev);
        prev = curr;
        curr = next;

        return reverse(curr, next, prev);
    }

}
