public class BST {

    public static void main(String[] args) {

        BST bst = new BST();
        bst.addNode(5);
        bst.addNode(11);
        bst.addNode(7);

        BST bstRec = new BST();
        bstRec.addNodeRecursive(5);
        bstRec.addNodeRecursive(11);
        bstRec.addNodeRecursive(7);

        System.out.println(bst);
        System.out.println(bstRec);

    }


    private TreeNode root;

    public BST() {
        this.root = null;
    }

    public BST(TreeNode root) {
        this.root = root;
    }

    public TreeNode getRoot() {
        return root;
    }

    public void setRoot(TreeNode root) {
        this.root = root;
    }

    public void addNode(int data) {
        TreeNode node = new TreeNode(data);

        if (root == null) {
            root = node;
            return;
        }

        TreeNode ptr = root;
        TreeNode prev = null ;

        while (ptr != null) {
            prev = ptr;
            if (data > ptr.getData()) {
                ptr = ptr.getRight();
            }
            else {
                ptr = ptr.getRight();
            }
        }

        if (data > prev.getData())
            prev.setRight(node);
        else {
            prev.setLeft(node);
        }
    }

    public void addNodeRecursive(int data) {
        root = recursiveAddBST(root, data);
    }

    public TreeNode recursiveAddBST(TreeNode node, int data) {
        if (node == null) {
            node = new TreeNode(data);
            return node;
        }

        if (data < node.getData()) {
            node.left = recursiveAddBST(node.left, data);
        } else if (data > node.getData()) {
            node.right = recursiveAddBST(node.right, data);
        }

        return node;
    }

    @Override
    public String toString() {
        return "BST{" +
                "root=" + root +
                '}';
    }
}
