public class LeetCode_143ReordeTheLinkedLIst {
  public static void main(String[] args) {
    System.out.println("Hello, World!");
  }
}
/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
// class Solution {
// public void reorderList(ListNode head) {
// if (head == null || head.next == null) return;
// ListNode mid=middleNode(head);
// ListNode endHead=reverseList(mid.next);
// mid.next=null;
// ListNode firstHead=head;
// ListNode start=firstHead;
// while(endHead!=null)
// {
// ListNode temp1 = firstHead.next;
// ListNode temp2 = endHead.next;
// firstHead.next=endHead;
// endHead.next=temp1;
//
// firstHead=temp1;
// endHead=temp2;
// }
// }
// public ListNode middleNode(ListNode head) {
// ListNode slow=head;
// ListNode fast=head;
// while(fast!=null && fast.next!=null){
// slow=slow.next;
// fast=fast.next.next;
// }
// return slow;
// }
// private ListNode reverseList(ListNode head) {
// ListNode prev = null, curr = head;
// while (curr != null) {
// ListNode nextNode = curr.next;
// curr.next = prev;
// prev = curr;
// curr = nextNode;
// }
// return prev;
// }
// }