package src.com.xiaozhi.queue;

import java.util.Scanner;

public class CircleQueue {
  public static void main(String[] args) {
    CircleArrayQueue queue = new CircleArrayQueue(3);
    char key = ' ';
    Scanner scanner = new Scanner(System.in);
    boolean loop = true;
    while (loop) {
      System.out.println("s(show):显示队列");
      System.out.println("e(exit):退出程序");
      System.out.println("a(add):添加数据到队列中");
      System.out.println("g(get):从队表中获取数据");
      System.out.println("h(head):查看队列头的数据");
      //接收一个字符
      key = scanner.next().charAt(0);
      switch (key) {
        case 's':
          queue.showQueue();
          break;
        case 'a':
          System.out.println("输入一个数");
          int value = scanner.nextInt();
          queue.addQueue(value);
          break;
        case 'g':
          try {
            int result = queue.getQueue();
            System.out.printf("取出的数据是%d\n", result);
          } catch (Exception e) {
            System.out.printf(e.getMessage());
          }
          break;
        case 'h':
          try {
            int result = queue.headQueue();
            System.out.printf("取出队列头的数据是%d\n", result);
          } catch (Exception e) {
            System.out.printf(e.getMessage());
          }
        case 'e':
          scanner.close();
          loop = false;
          break;
        default:
          break;
      }
    }
    System.out.printf("程序退出");
  }
}

class CircleArrayQueue {
  private int maxSize; //表示数组的最大容量
  private int front; //队列头
  private int rear; //队表尾
  private int arr[]; //用于存放数据

  public CircleArrayQueue(int maxSize) {
    this.maxSize = maxSize;
    this.arr = new int[maxSize];
  }

  // 判断队列是满
  public boolean isFull() {
    return (rear + 1) % this.maxSize == this.front;
  }

  // 判断队列是否为空
  public boolean isEmpty() {
    return rear == front;
  }

  //添加数据到队列中
  public void addQueue(int n) {
    if (isFull()) {
      System.out.printf("队列已满，不能加入数据");
      return;
    }
    this.arr[rear] = n;
    rear = (rear + 1) % maxSize;
  }

  // 获取队列的数据
  public int getQueue() {
    if (isEmpty()) {
      throw new RuntimeException("队列为空不能取数据");
    }
    int value = arr[this.front];
    this.front = (this.front + 1) % this.maxSize;
    return value;
  }

  // 显示队列的所有数据
  public void showQueue() {
    if (isEmpty()) {
      System.out.println("队表为空");
      return;
    }
    for (int i = this.front; i < this.front + this.size(); i++) {
      System.out.printf("arr[%d]=%d\n", i % this.maxSize, arr[i % maxSize]);
    }
  }

  // 当前队列的有效个数
  public int size() {
    return (this.rear + this.maxSize - this.front) % this.maxSize;
  }

  // 获取列表头数据
  public int headQueue() {
    if (isEmpty()) {
      throw new RuntimeException("队列为空");
    }
    return this.arr[this.front + 1];
  }

}
