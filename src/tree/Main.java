package tree;

public class Main {
    public static void main(String[] args) {
        Tree.Node n4 = new Tree.Node(4, null, null);
        Tree.Node n5 = new Tree.Node(5, null, null);
        Tree.Node n2 = new Tree.Node(2, n4, n5);
        Tree.Node n3 = new Tree.Node(3, null, null);
        Tree.Node n1 = new Tree.Node(1, n2, n3);

        Tree tree = new Tree(n1);

        /*
         *           1
         *         /   \
         *       2       3
         *     /   \
         *   4       5
         */

        System.out.println("InOrder");
        tree.inorder();

        System.out.println("PreOrder");
        tree.preorder();

        System.out.println("PostOrder");
        tree.postorder();
    }
}
