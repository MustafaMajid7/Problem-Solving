package tree;

public class BiTree implements Tree {

    private Root root;

    public BiTree(Root root) {
        this.root = root;
    }

    @Override
    public Root getRoot() {
        return root;
    }

    @Override
    public Node getLeftNode() {
        return root.getLeftNode();
    }

    @Override
    public Node getRightNode() {
        return root.getRightNode();
    }

}
