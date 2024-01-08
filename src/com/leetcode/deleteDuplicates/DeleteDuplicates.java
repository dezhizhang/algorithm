package src.com.leetcode.deleteDuplicates;

public class DeleteDuplicates {
  public static void main(String[] args) {
    ListNode listNode = new ListNode(1);
    listNode.next = new ListNode(1);
    listNode.next.next = new ListNode(2);
    listNode.next.next.next = new ListNode(3);
    listNode.next.next.next.next = new ListNode(3);
    deleteDuplicates(listNode);

//    [1,1,2,3,3]
  }
  public static ListNode deleteDuplicates(ListNode head) {
    if(head == null) {
      return head;
    }
    ListNode currentNode = head;
    while (null != currentNode.next) {
      if(currentNode.next.val == currentNode.val) {
        currentNode.next = currentNode.next.next;
      }else {
        currentNode = currentNode.next;
      }
    }
    return head;
  }
}

class ListNode{
  int val;
  ListNode next;
  ListNode(){}
  ListNode(int val) { this.val = val; }
  ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

