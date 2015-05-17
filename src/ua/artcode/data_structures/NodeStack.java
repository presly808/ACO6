package ua.artcode.data_structures;

public class NodeStack implements IStack {

    private Node top;

    @Override
    public void push(Object el) {
        if(top == null){
            top = new Node(el, null);
        } else {
            Node nNode = new Node(el, top);
            top = nNode;
        }
    }

    @Override
    public Object pop() {
        Object ret = top.getValue();

        top = top.getNext();//delete from chain

        return ret;
    }
}
