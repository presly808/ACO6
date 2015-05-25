package ua.artcode.data_structures.dynamic;

/**
 * Created by serhii on 17.05.15.
 */
public class CreateNodeSequence {


    public static void main(String[] args) {
        Node node1 = new Node("1", null);
        Node node2 = new Node("2", node1);
        Node node3 = new Node("3", node2);
        Node node4 = new Node("4", node3);

        node1.setNext(node4);


        NodeUtils.print(node4);
    }
}
