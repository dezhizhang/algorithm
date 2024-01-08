package src.com.leetcode.hasCycle;

public class HasCycle {
  public static void main(String[] args) {

  }

  public boolean hasCycle(ListNode head) {
    if (head == null) return false;
    ListNode slowPtr = head, fastPtr = head;
    while (fastPtr.next != null && fastPtr.next.next != null) {
      slowPtr = slowPtr.next;
      fastPtr = fastPtr.next.next;
      if (slowPtr == fastPtr) {
        return true;
      }
    }
    return false;
  }
}

class ListNode {
  int val;
  ListNode next;

  ListNode(int x) {
    val = x;
    next = null;
  }
}
