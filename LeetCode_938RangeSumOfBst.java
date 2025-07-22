import java.util.LinkedList;
import java.util.Queue;

import javax.swing.tree.TreeNode;

public class LeetCode_938RangeSumOfBst {
  public static void main(String[] args) {

  }

  // public int rangeSumBST(TreeNode root, int low, int high) {
  // if (root == null)
  // return 0;
  // int val = root.val;
  // if (root.val < low || root.val > high)
  // val = 0;
  // return val + rangeSumBST(root.left, low, high) + rangeSumBST(root.right, low,
  // high);
  // }
  // Queue<TreeNode> q = new LinkedList<>();
  // q.add(root);
  // int count = 0;
  // while (!q.isEmpty()) {
  // TreeNode removed = q.remove();
  // if (removed == null) {
  // return -1;
  // } else {
  // if(removed.val>=low && removed.val<=high) count += removed.val;
  // if (removed.left != null) {
  // q.add(removed.left);
  // }
  // if (removed.right != null) {
  // q.add(removed.right);
  // }
  // }
  // }
  // return count;
  // }
}