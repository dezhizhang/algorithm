package src.com.leetcode.intersectionNode;

public class IntersectionNode {
  public static void main(String[] args) {

  }
  public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
    if(headA == null || headB == null) {
      return null;
    }
    ListNode pA = headA,pB = headB;
    while (pA != pB) {
      pA = pA == null ? headB:pA.next;
      pB = pB == null ? headA:pB.next;
    }
    return pA;
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

