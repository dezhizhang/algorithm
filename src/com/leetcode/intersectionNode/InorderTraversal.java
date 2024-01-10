package src.com.leetcode.intersectionNode;

import src.com.xiaozhicloud.recursion.Queue8;

import java.util.*;

public class InorderTraversal {
  public static void main(String[] args) {

  }

  public List<Integer> inorderTraversal(TreeNode root) {
    List<Integer> res = new LinkedList<>();
    Deque<TreeNode> stack = new LinkedList<TreeNode>();

    while (root != null || !stack.isEmpty()) {
      while (root != null) {
        stack.push(root);
        root = root.left;
      }
      root = stack.pop();
      res.add(root.val);
      root = root.right;
    }
    return res;
  }


//  public List<Integer> inorderTraversal(TreeNode root) {
//    List<Integer> res = new ArrayList<Integer>();
//    accessTree(root,res);
//    return res;
//  }
//
//  public void accessTree(TreeNode root,List<Integer> res) {
//    if(root == null) {
//      return;
//    }
//    accessTree(root.left,res);
//    res.add(root.val);
//    accessTree(root.right,res);
//  }
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




