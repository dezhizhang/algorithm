package src.com.leetcode.reverseList;

public class ReverseList {
  public static void main(String[] args) {

  }

  public ListNode reverseList(ListNode head) {
    ListNode preNode = null;
    ListNode curr = head;
    while (curr != null) {
      ListNode next = curr.next;
      curr.next = preNode;
      preNode = curr;
      curr = next;
    }
    return preNode;
  }
}


class ListNode {
  int val;
  ListNode next;

  ListNode() {
  }

  ListNode(int val) {
    this.val = val;
  }

  ListNode(int val, ListNode next) {
    this.val = val;
    this.next = next;
  }
}
