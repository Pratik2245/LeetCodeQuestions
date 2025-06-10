import javax.swing.tree.TreeNode;

public class LeetCode_222CountCompleteTreeNodes {
  public static void main(String[] args) {
    countNodes();
  }

  public static int countNodes(TreeNode root) {
    if (root == null)
      return 0;
    int left = countNodes(root.left);
    int right = countNodes(root.right);
    return (left + right) + 1;

  }
}
