package tree;

public class Root {
    private int value;
    private Node LeftNode;
    private Node RightNode;

    public Root(int value) {
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

    @Override
    public String toString() {
        return "Root { " +
                "value = " + value +
                " }";
    }
}
