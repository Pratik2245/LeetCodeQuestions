public class LeetCode_234PalindromeOfLinkedList {
  public static void main(String[] args) {

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
// public boolean isPalindrome(ListNode head) {
// if (head == null || head.next == null)
// return true;
//
// // Step 1: Find the middle of the linked list using slow and fast pointers
// ListNode slow = head, fast = head;
// while (fast != null && fast.next != null) {
// slow = slow.next;
// fast = fast.next.next;
// }
//
// // Step 2: Reverse the second half of the list
// ListNode secondHalfStart = reverseList(slow);
// ListNode firstHalfStart = head;
//
// // Step 3: Compare the first and second half nodes
// while (secondHalfStart != null) {
// if (firstHalfStart.val != secondHalfStart.val) {
// return false;
// }
// firstHalfStart = firstHalfStart.next;
// secondHalfStart = secondHalfStart.next;
// }
//
// return true;
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