package src.com.leetcode.detectCycle;

public class DetectCycle {
  public static void main(String[] args) {

  }
  public ListNode detectCycle(ListNode head) {
      if(head == null) return null;
      ListNode slowPtr = head,fastPtr = head;
      boolean loopExists = false;
      while (fastPtr.next != null && fastPtr.next.next != null) {
        slowPtr = slowPtr.next;
        fastPtr = fastPtr.next.next;
        if(slowPtr == fastPtr) {
          loopExists = true;
          break;
        }
      }
      if(loopExists) {
        slowPtr = head;
        while (slowPtr != fastPtr) {
          fastPtr = fastPtr.next;
          slowPtr = slowPtr.next;
        }
        return  slowPtr;
      }
      return  null;
  }
}

class ListNode{
  int val;
  ListNode next;
  ListNode(int x) {
    val = x;
    next = null;
  }
}


