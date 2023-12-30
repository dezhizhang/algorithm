package src.com.xiaozhicloud.tree;

class BinaryTreeTest {
  public static void main(String[] args) {
    BinaryTree binaryTree = new BinaryTree();
    HeroNode root = new HeroNode(1, "宋江");
    HeroNode node2 = new HeroNode(2, "吴用");
    HeroNode node3 = new HeroNode(3, "卢俊义");
    HeroNode node4 = new HeroNode(4, "林冲");
    root.setLeft(node2);

    root.setRight(node3);
    node3.setRight(node4);

    binaryTree.setRoot(root);

    System.out.println("前序遍历");
    binaryTree.preOrder();

    System.out.println("中序遍历");
    binaryTree.infixOrder();

    System.out.println("后序遍历");
    binaryTree.postOrder();


  }
}

class BinaryTree {
  private HeroNode root;

  public void setRoot(HeroNode root) {
    this.root = root;
  }

  public void preOrder() {
    if (this.root == null) {
      System.out.println("二叉树为空，无法遍历");
      return;
    }

    this.root.preOrder();
  }

  public void infixOrder() {
    if (this.root == null) {
      System.out.println("二叉树为空，无法遍历");
      return;
    }
    this.root.infixOrder();
  }

  // 后序遍历
  public void postOrder() {
    if (this.root == null) {
      System.out.println("二叉树为空，无法遍历");
      return;
    }
    this.root.postOrder();
  }

  // 前序查找
  public HeroNode preOrderSearch(int no) {
    if(root == null) {
      return null;
    }
    return root.postOrderSearch(no);
  }

  // 中序查找
  public HeroNode infixOrderSearch(int no) {
    if(root == null) {
      return null;
    }
    return root.infixOrderSearch(no);
  }

  // 后序查找
  public HeroNode postOrderSearch(int no) {
    if(root == null) {
      return null;
    }
    return root.postOrderSearch(no);
  }

}


class HeroNode {
  private int no;
  private String name;
  private HeroNode left;
  private HeroNode right;

  public HeroNode(int no, String name) {
    this.no = no;
    this.name = name;
  }

  public int getNo() {
    return no;
  }

  public void setNo(int no) {
    this.no = no;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public HeroNode getLeft() {
    return left;
  }

  public void setLeft(HeroNode left) {
    this.left = left;
  }

  public HeroNode getRight() {
    return right;
  }

  public void setRight(HeroNode right) {
    this.right = right;
  }

  // 前序遍历方法
  public void preOrder() {
    System.out.println(this);
    if (this.left != null) {
      this.left.preOrder();
    }
    if (this.right != null) {
      this.right.preOrder();
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

  // 后序遍历
  public void postOrder() {
    if (this.left != null) {
      this.left.postOrder();
    }
    if (this.right != null) {
      this.right.postOrder();
    }
    System.out.println(this);
  }

  // 前序遍历查找
  public HeroNode preOrderSearch(int no) {
    if (this.no == no) {
      return this;
    }
    HeroNode curNode = null;
    if (this.left != null) {
      curNode = this.left.preOrderSearch(no);
    }
    if (curNode != null) {
      return curNode;
    }
    if (this.right != null) {
      curNode = this.right.preOrderSearch(no);
    }
    return curNode;
  }

  // 中序遍历查找
  public HeroNode infixOrderSearch(int no) {
    HeroNode curNode = null;
    if(this.left == null) {
      curNode = this.left.infixOrderSearch(no);
    }

    if(curNode != null) {
      return curNode;
    }

    if(this.no == no) {
      return this;
    }

    if(this.right !=null) {
      curNode = this.right.preOrderSearch(no);
    }

    return curNode;

  }

  // 后序遍历查找
  public HeroNode postOrderSearch(int no) {
    HeroNode curNode = null;
    if(this.left != null) {
      curNode = this.left.postOrderSearch(no);
    }

    if(curNode != null) {
      return curNode;
    }

    // 没有找到则递归向右子树遍历查找
    if(this.right != null) {
      curNode = this.right.postOrderSearch(no);
    }

    if(curNode != null) {
      return curNode;
    }

    if(this.no == no) {
      return this;
    }
    return curNode;
  }

  @Override
  public String toString() {
    return "HeroNode[no=" + no + ",name=" + name + "]";
  }
}
