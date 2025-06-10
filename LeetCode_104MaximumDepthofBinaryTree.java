import javax.swing.tree.TreeNode;

public class LeetCode_104MaximumDepthofBinaryTree {
  public static void main(String[] args) {

  }

  public int maxDepth(TreeNode root) {
    if (root == null)
      return 0;
    int leftHeight = maxDepth(root.left);
    int rightHeight = maxDepth(root.right);
    return Math.max(leftHeight, rightHeight) + 1;
  }
}
