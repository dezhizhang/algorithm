package src.com.xiaozhicloud.binarysorttree;

class BinarySortTreeTest {
  public static void main(String[] args) {
    int[] arr = {4,3,6,5,7,8};
    AVLTree avlTree = new AVLTree();
    for(int i=0;i < arr.length;i++) {
      avlTree.add(new Node(arr[i]));

    }

    avlTree.infixOrder();
    // 求取树的高度
    System.out.println(avlTree.getRoot().height());
    System.out.println("左子树的高度"+avlTree.getRoot().leftHeight());
    System.out.println("右子树的高度" + avlTree.getRoot().rightHeight());

  }
}


class AVLTree{
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

  public Node getRoot() {
    return root;
  }

  // 查找要删除的节点
  public Node search(int value) {
    if(root == null) {
      return null;
    }

    return root.search(value);
  }

  // 查找父节点
  public Node searchParent(int value) {
    if(root == null) {
      return null;
    }
    return root.searchParent(value);
  }

  // 删除节点
  public void deleteNode(int value) {
    if(root == null) {
      System.out.println("节点为空");
      return;
    }

    Node targetNode = search(value);
    if(targetNode == null) {
      System.out.println("没有找到要删除的节点");
      return;
    }

    // 当前这颗二叉树只有一个节点
    if(root.left == null && root.right == null) {
      root = null;
      return;
    }

    // 要删除的节点是叶子节点
    Node parent = searchParent(value);
    if(targetNode.left == null && targetNode.right == null) {
      if(parent.left != null && parent.left.value == value) {
        parent.left = null;
      }else if(parent.right != null && parent.right.value == value) {
        parent.right = null;
      }
    }

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

  // 返回左子树高度
  public  int leftHeight() {
    if(left == null) {
      return 0;
    }
    return left.height();
  }
  // 返回右子树的高度
  public int rightHeight() {
    if(right == null) {
      return 0;
    }
    return right.height();
  }

  // 反回右子树的高度
  public int height() {
    return Math.max(left == null ? 0:left.height(),right == null ? 0:right.height()) + 1;
  }

  public Node search(int value) {
    if(value == this.value) {
      return  this;
    }

    // 如果查找的值小于当前节点的值，向左子树递归查找
    if(value < this.value) {
      if(this.left == null) {
        return null;
      }

      return this.left.search(value);
    }

    if(value > this.value) {
      if(this.right == null) {
        return null;
      }
      return  this.right.search(value);
    }

    return  null;
  }

  // 查找要删除节点的父节点
  public Node searchParent(int value) {
    if((this.left != null && this.left.value == value) ||
      (this.right != null && this.right.value == value)) {
      return this;
    }

    // 左子树递归查找
    if(value < this.value && this.left != null) {
      return this.left.searchParent(value);
    }

    // 右子树递归查找
    if(value > this.value && this.right != null) {
      return this.right.searchParent(value);
    }

    return null;
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
