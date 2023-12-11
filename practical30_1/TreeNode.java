package practical30_1;

class TreeNode {
    int value;
    TreeNode left;
    TreeNode right;

    public TreeNode(int value) {
        this.value = value;
    }
}

class BinarySearchTree {
    public static void main(String[] args) {
        TreeNode root = createBinarySearchTree();

        System.out.println("Содержимое дерева:");
        printTree(root);
    }

    public static TreeNode createBinarySearchTree() {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(8);
        root.left.left.left = new TreeNode(1);
        root.right.right.right = new TreeNode(9);
        root.right.right.right.right = new TreeNode(10);

        return root;
    }

    public static void printTree(TreeNode root) {
        if (root == null) {
            return;
        }

        printTree(root.left);
        System.out.println(root.value);
        printTree(root.right);
    }
}
