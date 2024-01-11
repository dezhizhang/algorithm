package src.com.leetcode.maxDepth;

public class MaxDepth {
  public static void main(String[] args) {

  }
  public int maxDepth(TreeNode root) {
      if(root == null) {
        return 0;
      }
      return Math.max(maxDepth(root.left),maxDepth(root.right)) + 1;
  }
}


class TreeNode {
  int val;
  TreeNode left;
 TreeNode right;

  TreeNode() {
  }

  TreeNode(int val) {
    this.val = val;
  }

  TreeNode(int val, TreeNode left, TreeNode right) {
    this.val = val;
    this.left = left;
    this.right = right;
  }
}
