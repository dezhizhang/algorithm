package src.com.xiaozhicloud.binarysorttree;

class BinarySortTreeTest {
  public static void main(String[] args) {
      int[] arr = {7,3,10,12,5,1,9};
      BinarySortTree binarySortTree = new BinarySortTree();
     for(int i=0;i < arr.length;i++) {
       binarySortTree.add(new Node(arr[i]));
     }

     binarySortTree.infixOrder();
  }
}


class BinarySortTree{
  private Node root;
  public void add(Node node) {
    if(root == null) {
      root = node;
    }else {
      root.add(node);
    }
  }

  // 中序遍历
  public void infixOrder() {
    if(root == null) {
      System.out.println("二叉排序数为空");
      return;
    }

    root.infixOrder();
  }
}




// 创建节点
class Node {
  int value;
  Node left;
  Node right;

  public Node(int value) {
    this.value = value;
  }

  public void add(Node node) {
    if (node == null) {
      System.out.println("节点为空");
      return;
    }
    // 传入的结点值和当前子树的根节点的值关系
    if (node.value < this.value) {
      if (this.left == null) {
        this.left = node;
      } else {
        // 递归的向左子树添加
        this.left.add(node);
      }
    }

    if (node.value > this.value) {
      if (this.right == null) {
        this.right = node;
      } else {
        // 递当的向右子树添加
        this.right.add(node);
      }
    }
  }

  // 中序遍历
  public void infixOrder() {
    if (this.left != null) {
      this.left.infixOrder();
    }
    System.out.println(this);
    if (this.right != null) {
      this.right.infixOrder();
    }
  }

  @Override
  public String toString() {
    return "Node [value=" + value + "]";
  }
}
