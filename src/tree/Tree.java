package tree;

public class Tree {
    public static class Node {
        private Object data;
        private Node left;
        private Node right;

        public Node(Object data, Node left, Node right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }

    private Node root;

    public Tree(Node root) {
        this.root = root;
    }

    public void inorder() {
        inorder(root);
    }
    private void inorder(Node root) {
        if (root == null)
            return;

        inorder(root.left);
        System.out.println(root.data);
        inorder(root.right);
    }

    public void preorder() {
        preorder(root);
    }
    private void preorder(Node root) {
        if (root == null)
            return;

        System.out.println(root.data);
        preorder(root.left);
        preorder(root.right);
    }

    public void postorder() {
        postorder(root);
    }
    private void postorder(Node root) {
        if (root == null)
            return;

        postorder(root.left);
        postorder(root.right);
        System.out.println(root.data);
    }
}
