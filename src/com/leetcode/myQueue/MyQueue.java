package src.com.leetcode.myQueue;

import java.util.Stack;

public class MyQueue {
  public static void main(String[] args) {

  }

  private static Stack<Integer> inStack;
  private static Stack<Integer> outStack;


  public MyQueue() {
    inStack = new Stack<Integer>();
    outStack = new Stack<Integer>();
  }

  public void push(int x) {
    inStack.push(x);
  }
  public int pop() {
    if(outStack.isEmpty()) {
      in2out();
    }
    return outStack.pop();
  }

  public int peek() {
    if(outStack.isEmpty()) {
      in2out();
    }
    return outStack.peek();
  }

  public boolean empty() {
    return inStack.isEmpty() && outStack.isEmpty();
  }

  private void in2out() {
    while (!inStack.isEmpty()) {
      outStack.push(inStack.pop());
    }
  }

}
