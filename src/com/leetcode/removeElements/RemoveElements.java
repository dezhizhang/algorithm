package src.com.leetcode.removeElements;

public class RemoveElements {
  public static void main(String[] args) {

  }
  public ListNode removeElements(ListNode head, int val) {
    ListNode dummyHead = new ListNode(0);
    head.next = head;
    ListNode temp = dummyHead;
    while (temp.next != null) {
      if(temp.next.val == val) {
        temp.next = temp.next.next;
      }else {
        temp = temp.next;
      }
    }
    return  dummyHead.next;
  }

}

class ListNode{
  int val;
  ListNode next;
  ListNode() {}
  ListNode(int val) { this.val = val; }
  ListNode(int val, ListNode next) { this.val = val; this.next = next; }

}


