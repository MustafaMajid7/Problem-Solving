package tree;

public interface Tree {

    Root getRoot();
    Node getLeftNode();
    Node getRightNode();

}

//    Root R = new Root(10);
//    Node n1 = new Node(15);
//    Node n2 = new Node(5);
//    Node n3 = new Node(3);
//    Node n4 = new Node(8);
//    Node n5 = new Node(12);
//    Node n6 = new Node(18);
//
//        R.setLeftNode(n2);
//                R.setRightNode(n1);
//                n2.setLeftNode(n3);
//                n2.setRightNode(n4);
//                n1.setLeftNode(n5);
//                n1.setRightNode(n6);
//
//                Tree tree = new BiTree(R);
//
//                System.out.println(tree.getRoot());
//                Node LN = tree.getLeftNode();
//                Node RN = tree.getRightNode();
//
//                LN.traverse();
//                RN.traverse();
