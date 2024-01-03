package src.com.xiaozhicloud.avl;

class AvlTreeTest {
  public static void main(String[] args) {

  }
}

// 创建avlTree
class  AvlTree{

}
// 创建节点
class Node {
  int value;
  Node left;
  Node right;

  public Node(int value) {
    this.value = value;
  }

  // 返回左子树的高度
  public int leftHeight() {
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


