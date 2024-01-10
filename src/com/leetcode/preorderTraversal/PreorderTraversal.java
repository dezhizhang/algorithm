package src.com.leetcode.preorderTraversal;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class PreorderTraversal {
  public static void main(String[] args) {

  }
  public List<Integer> preorderTraversal(TreeNode root) {
    List<Integer> res = new ArrayList<>();
    Deque<TreeNode> stack = new LinkedList<>();
    while (root != null || !stack.isEmpty()) {
      while (root != null) {
        res.add(root.val);
        stack.push(root);
        root = root.left;
      }

      root = stack.pop();
      root = root.right;
    }
    return  res;
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
