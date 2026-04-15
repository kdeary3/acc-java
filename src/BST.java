import java.sql.SQLOutput;

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
        bstRec.addNodeRecursive(6);
        bstRec.addNodeRecursive(4);
        bstRec.addNodeRecursive(12);
        bstRec.addNodeRecursive(54);
        bstRec.addNodeRecursive(56);
        bstRec.addNodeRecursive(77);
        bstRec.addNodeRecursive(34);
        bstRec.addNodeRecursive(1234);
        bstRec.addNodeRecursive(23);
        bstRec.addNodeRecursive(234);
        bstRec.addNodeRecursive(22);
        bstRec.addNodeRecursive(345);
        bstRec.addNodeRecursive(4434);

        bstRec.inOrderPrint(bstRec.getRoot());
//        System.out.println(bstRec.search(1234));
        System.out.println(bstRec.searchRecursive(bstRec.getRoot(), 1234));

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
        TreeNode prev = null;

        while (ptr != null) {
            prev = ptr;
            if (data > ptr.getData()) {
                ptr = ptr.getRight();
            } else {
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

    // recursive prints
    public void inOrderPrint(TreeNode node) {
        if (node == null) {
            return;
        }

        TreeNode ptr = node;

        if (ptr != null) {
            inOrderPrint(ptr.left);
            System.out.print(ptr.getData() + " ");
            inOrderPrint(ptr.right);
        }
    }

    public void preOrderPrint(TreeNode node) {
        if (node == null) {
            return;
        }

        TreeNode ptr = node;

        if (ptr != null) {
            System.out.print(ptr.getData() + " ");
            inOrderPrint(ptr.left);
            inOrderPrint(ptr.right);
        }
    }

    public void postOrderPrint(TreeNode node) {
        if (node == null) {
            return;
        }
        TreeNode ptr = node;

        if (ptr != null) {
            inOrderPrint(ptr.left);
            inOrderPrint(ptr.right);
            System.out.print(ptr.getData() + " ");
        }
    }

    public boolean search(int data) {
        if (root == null) {
            return false;
        }

        TreeNode ptr = root;

        while (ptr != null) {
            if (data == ptr.getData()) {
                return true;
            }

            if (data > ptr.getData()) {
                ptr = ptr.getRight();
            } else {
                ptr = ptr.getLeft();
            }
        }
        return false;
    }

    public boolean searchRecursive(TreeNode node, int data) {
        if (node == null) return false;
        if (data == node.getData()) return true;

        if (data > node.getData()) {
            return searchRecursive(node.getRight(), data);
        } else {
            return searchRecursive(node.getLeft(), data);
        }
    }

    public void delete(int data){
        root = deleteNode(root,data);
    }

    TreeNode deleteNode(TreeNode root, int data) {
        if (root == null)
            return null;

        if (data < root.data)
            root.left = deleteNode(root.left, data);
        else if (data > root.data)
            root.right = deleteNode(root.right, data);
        else {
            // Node with one or no child
            if (root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;
            // Node with two children: Get the inorder successor (smallest in the right subtree)
            root.data = minValue(root.right);
            // Delete the inorder successor
            root.right = deleteNode(root.right, root.data);
        }
        return root;
    }
    int minValue(TreeNode node) {
        int minv = node.data;
        while (node.left != null) {
            minv = node.left.data;
            node = node.left;
        }
        return minv;
    }

    @Override
    public String toString() {
        return "BST{" +
                "root=" + root +
                '}';
    }
}
