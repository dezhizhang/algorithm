# 数据结构与算法

### 队列
```java
public class Queue {
  public static void main(String[] args) {
      ArrayQueue arrayQueue = new ArrayQueue(5);
      arrayQueue.addQueue(1);
      arrayQueue.addQueue(10);
      arrayQueue.addQueue(20);
      arrayQueue.addQueue(4);
      arrayQueue.getQueue();
      arrayQueue.showQueue();
  }
}

class ArrayQueue{
  private int maxSize; //表示数组的最大容量
  private int front; //队列头
  private int rear; // 队表尾
  private int arr[]; //用于存放数据
  public ArrayQueue(int maxSize) {
    this.maxSize = maxSize;
    this.arr = new int[maxSize];
    this.front = -1;
    this.rear = -1;
  }

  // 判断队列是满
  public boolean isFull() {
    return  rear == maxSize - 1;
  }

  // 判断队列是否为空
  public boolean isEmpty() {
    return rear == maxSize - 1;
  }

  // 添加数据到队列中
  public void addQueue(int n) {
    if(isFull()) {
      System.out.println("队列已满，不能加入数据");
      return;
    }
    this.rear++;
    this.arr[rear] = n;
  }

  // 获取队列的数据
  public int getQueue() {
    if(isEmpty()) {
      throw new RuntimeException("队列为空不能取数据");
    }
    this.front++;
    return this.arr[this.front];
  }

  // 显示队列的所有数据
  public void showQueue() {
    if (isEmpty()) {
      System.out.println("队表为空");
      return;
    }
    for (int i=0;i < arr.length;i++) {
      System.out.printf("arr[%d]=%d\n",i,arr[i]);
    }
  }
  // 获取列表头数据
  public int headQueue() {
    if(isEmpty()) {
      throw new RuntimeException("队列为空");
    }
    return this.arr[this.front + 1];
  }

}
```
