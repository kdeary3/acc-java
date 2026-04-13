public class TreeNode {
    public int data;
    public TreeNode right;
    public TreeNode left;

    public TreeNode() {
        this.data = 0;
        this.right = null;
        this.left = null;
    }

    public TreeNode(int data, TreeNode right, TreeNode left) {
        this.data = data;
        this.right = right;
        this.left = left;
    }

    public TreeNode(int data) {
        this.data = data;
        this.right = null;
        this.left = null;
    }

    public int getData() {
        return data;
    }

    public TreeNode getLeft() {
        return left;
    }

    public TreeNode getRight() {
        return right;
    }

    public void setData(int data) {
        this.data = data;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    @Override
    public String toString() {
        return "TreeNode{" +
                "data=" + data +
                ", right=" + right +
                ", left=" + left +
                '}';
    }
}
