package src.com.leetcode.isSymmetric;


import java.util.LinkedList;
import java.util.Queue;

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

public class IsSymmetric {
  public static void main(String[] args) {

  }

  public boolean isSymmetric(TreeNode root) {
    Queue<TreeNode> q = new LinkedList<TreeNode>();
    TreeNode u = root.left;
    TreeNode v = root.right;
    if(root == null || (u == null && v == null)) {
      return true;
    }
    q.offer(u);
    q.offer(v);

    while (!q.isEmpty()) {
      u = q.poll();
      v = q.poll();
      if(u == null && v == null) {
        continue;
      }
      if((u == null || v == null) || (u.val != v.val)) {
        return false;
      }
      q.offer(u.left);
      q.offer(v.right);


      q.offer(u.right);
      q.offer(v.left);
    }
    return  true;
  }

}
