package src.com.xiaozhicloud.stack;

import java.util.Scanner;

class ArrayStackTest {
  public static void main(String[] args) {
    ArrayStack stack = new ArrayStack(4);
    String key = "";
    boolean loop = true; // 控制是否退出菜单
    Scanner scanner = new Scanner(System.in);

    while (loop) {
      System.out.println("show:显示栈");
      System.out.println("exit:退出程序");
      System.out.println("push:添加数据");
      System.out.println("pop: 出栈");
      System.out.println("请输入你的选择");
      key = scanner.next();

      switch (key) {
        case "show":
          stack.list();
          break;
        case "push":
          System.out.println("请输入一个数");
          int value = scanner.nextInt();
          stack.push(value);
          break;
        case "pop":
          try{
            int result = stack.pop();
            System.out.printf("出栈的数据为%d",result);
          }catch (Exception e) {
            System.out.println(e.getMessage());
          }
          break;
        case "exit":
          scanner.close();
          loop = false;
          break;
        default:
          break;
      }
    }

  }
}

class ArrayStack {
  private int maxSize; // 栈的大小
  private int[] stack;
  private int top = -1; //top表示栈顶

  public ArrayStack(int maxSize) {
    this.maxSize = maxSize;
    stack = new int[this.maxSize];
  }

  // 栈满
  public boolean isFull() {
    return top == maxSize - 1;
  }

  // 栈空
  public boolean isEmpty() {
    return top == -1;
  }

  // 入栈push
  public void push(int value) {
    if (isFull()) {
      System.out.println("栈满");
      return;
    }
    top++;
    stack[top] = value;
  }

  // 出栈
  public int pop() {
    // 先判断栈是否为空
    if (isEmpty()) {
      System.out.println("栈为空");
      throw new RuntimeException("栈空");
    }
    int value = stack[top];
    top--;
    return value;
  }

  // 显示栈
  public void list() {
    if (isEmpty()) {
      System.out.println("栈空");
      return;
    }
    for (int i = top; i >= 0; i--) {
      System.out.printf("stack[%d]=%d\n", i, stack[i]);
    }
  }

}
