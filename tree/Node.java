package tree;

public class Node {

    private int value;
    private Node LeftNode = null;
    private Node RightNode = null;

    public Node(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public Node getLeftNode() {
        return LeftNode;
    }

    public void setLeftNode(Node leftNode) {
        LeftNode = leftNode;
    }

    public Node getRightNode() {
        return RightNode;
    }

    public void setRightNode(Node rightNode) {
        RightNode = rightNode;
    }

    public void traverse() {

        if (Node.this.getLeftNode() != null)
            Node.this.getLeftNode().traverse();

        System.out.println(this.getValue());

        if (Node.this.getRightNode() != null)
            Node.this.getRightNode().traverse();

    }


}
