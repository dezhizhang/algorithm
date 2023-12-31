package src.com.xiaozhicloud.tree;

class ArrayBinaryTreeTest {
  public static void main(String[] args) {
      int[] arr = {1,2,3,4,5,6,7};
      ArrayBinaryTree arrayBinaryTree = new ArrayBinaryTree(arr);
      arrayBinaryTree.preOrder();
  }
}


/*
* 第n个元素的左子节点为2 * n + 1
* 第n个元素的右子节点为2 * n + 2
* 第n个元素的父节点为(n - 1) / 2
* */
class  ArrayBinaryTree {
  private int[] arr;
  public ArrayBinaryTree(int[] arr) {
    this.arr = arr;
  }

  public void preOrder() {
    this.preOrder(0);
  }

  public void preOrder(int index) {
    if(arr == null || arr.length == 0) {
      System.out.println("数组为空");
      return;
    }
    System.out.printf("%d",arr[index]);

    // 向左遍历
    if((index * 2 + 1) < arr.length) {
      preOrder(2 * index + 1);
    }
    // 向右遍历
    if((index * 2 + 2) < arr.length) {
      preOrder(2 * index + 2);
    }

  }

}


