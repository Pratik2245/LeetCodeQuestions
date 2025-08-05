
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
public class LeetCode_101SymmetricTree {
  public static boolean isSymmetric(TreeNode root) {
        if (root == null) return true;
        return helper(root.left, root.right);
    }

    public static boolean helper(TreeNode leftNode, TreeNode rightNode) {
        if (leftNode == null && rightNode == null) return true;
        if (leftNode == null || rightNode == null) return false;
        if (leftNode.val != rightNode.val) return false;
        return helper(leftNode.left, rightNode.right) && helper(leftNode.right, rightNode.left);
    }
    public static void main(String[] args) {
        /**
         * Example symmetric tree (5 levels):
         * 
         *             1
         *           /   \
         *          2     2
         *         / \   / \
         *        3   4 4   3
         *       /           \
         *      5             5
         */

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2, new TreeNode(3, new TreeNode(5), null), new TreeNode(4));
        root.right = new TreeNode(2, new TreeNode(4), new TreeNode(3, null, new TreeNode(5)));

        boolean result = isSymmetric(root);
        System.out.println("Is tree symmetric? " + result);
    }
}