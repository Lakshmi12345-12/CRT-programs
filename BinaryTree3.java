class Node {
    int data;
    Node left, right;

    public Node(int data) {
        this.data = data;
        this.left = this.right = null;
    }
}

class BinaryTree3 {
    Node root;
    int sumOfNodes(Node node) {
        if (node == null) {
            return 0; 
        }
        return sumOfNodes(node.left) + sumOfNodes(node.right) + node.data;
    }

    public static void main(String[] args) {
        BinaryTree3 tree = new BinaryTree3();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        int sum = tree.sumOfNodes(tree.root);
        System.out.println("Sum of all nodes: " + sum); 
    }
}