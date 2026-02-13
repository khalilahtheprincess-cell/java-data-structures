public class BSTLab {

    // Node class for the Binary Search Tree
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    // Root of the BST
    Node root;

    // Insert method (public wrapper)
    public void insert(int value) {
        root = insertRec(root, value);
    }

    // Recursive insert into BST: Left < Root < Right
    private Node insertRec(Node current, int value) {
        if (current == null) {
            return new Node(value);
        }

        if (value < current.data) {
            current.left = insertRec(current.left, value);
        } else {
            current.right = insertRec(current.right, value);
        }

        return current;
    }

    // Preorder traversal: Root, Left, Right
    public void preorder(Node node) {
        if (node == null) return;
        System.out.print(node.data + " ");
        preorder(node.left);
        preorder(node.right);
    }

    // Inorder traversal: Left, Root, Right
    public void inorder(Node node) {
        if (node == null) return;
        inorder(node.left);
        System.out.print(node.data + " ");
        inorder(node.right);
    }

    // Postorder traversal: Left, Right, Root
    public void postorder(Node node) {
        if (node == null) return;
        postorder(node.left);
        postorder(node.right);
        System.out.print(node.data + " ");
    }

    // Main method to build the tree and print traversals
    public static void main(String[] args) {
        BSTLab tree = new BSTLab();

        int[] values = {25, 10, 5, 35, 3, 7, 40, 31, 36, 30, 15, 11};

        // Insert all values into the BST
        for (int v : values) {
            tree.insert(v);
        }

        System.out.print("Preorder: ");
        tree.preorder(tree.root);
        System.out.println();

        System.out.print("Inorder: ");
        tree.inorder(tree.root);
        System.out.println();

        System.out.print("Postorder: ");
        tree.postorder(tree.root);
        System.out.println();
    }
}
