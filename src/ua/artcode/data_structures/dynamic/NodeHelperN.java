package ua.artcode.data_structures.dynamic;

/**
 * Created by serhii on 17.05.15.
 */
public class NodeHelperN implements INodeHelper {



    // *1->2->3->4
    @Override
    public void addToTail1(Node head, Object val) {
        Node iter = head;

        //find free palce, go to tail
        while(iter.getNext() != null){
            iter = iter.getNext();
        }

        // create new node
        Node next = new Node(val, null);

        // link new node to tail
        iter.setNext(next);

    }

    @Override // 1->2->*3->null
    public void addToTail2(Node tail, Object val) {
        // wrap value by node
        Node nNode = new Node(val,null);

        //link node
        tail.setNext(nNode);
    }


    // *1->2->3
    @Override
    public Node addToHead(Node head, Object val) {
        Node nNode = new Node(val, head);

        return nNode;
    }

    @Override
    public String toString(Node head) {
        return null;
    }

    @Override
    public Node createNode(Object... mas) {

        if(mas.length < 1){ // mas is empty
            return null;
        }

        Node head = new Node(mas[0], null);
        Node tail = head;

        for (int i = 1; i < mas.length; i++) {
            Node nNode = new Node(mas[i], null);
            tail.setNext(nNode);
            tail = nNode;
        }

        return head;
    }

    @Override
    public Node createNodeR(Object... mas) {
        return null;
    }

    @Override
    public int count(Node head) {
        return 0;
    }

    @Override
    public Node remove(Node head, Object val) {
        return null;
    }

    @Override
    public Object[] toArray(Node head) {
        return new Object[0];
    }

    @Override
    public Node reverse(Node curr) {
        return null;
    }

    @Override
    public Node reverse(Node curr, Node next, Node prev) {
        return null;
    }
}
