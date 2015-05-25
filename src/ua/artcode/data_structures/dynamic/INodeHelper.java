package ua.artcode.data_structures.dynamic;

/**
 * Created by serhii on 17.05.15.
 */
public interface INodeHelper {


    public void addToTail1(Node head,Object val);

    public void addToTail2(Node tail,Object val);

    public Node addToHead(Node head ,Object val);

    public String toString(Node head);

    // 1,2,3,4,5
    public Node createNode(Object...mas);

    public Node createNodeR(Object...mas);

    public int count(Node head);

    public Node remove(Node head, Object val);
    public Object[] toArray(Node head);

    public  Node reverse(Node curr);

    public Node reverse(Node curr, Node next, Node prev);
}
