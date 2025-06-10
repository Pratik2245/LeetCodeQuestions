public class LeetCode_2AddTwoNumbers {
  public static void main(String[] args) {
    ListNode l1 = new ListNode(2);
    l1.next = new ListNode(4);
    l1.next.next = new ListNode(3);

    // Creating second linked list: 5 -> 6 -> 4
    ListNode l2 = new ListNode(5);
    l2.next = new ListNode(6);
    l2.next.next = new ListNode(4);

    // Add two numbers
    ListNode result = addTwoNumbers(l1, l2);
    System.out.println(result.val);
  }

  public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    int sum = 0;
    ListNode dummy = new ListNode(0);
    ListNode currListNode = dummy;
    int carry = 0;
    while (l1 != null || l2 != null || carry != 0) {
      int x = (l1 != null) ? l1.val : 0;
      int y = (l2 != null) ? l2.val : 0;

      sum = x + y + carry;

      carry = sum / 10;

      currListNode.next = new ListNode(sum % 10);
      currListNode = currListNode.next;

      if (l1 != null) {
        l1 = l1.next;
      }
      if (l2 != null) {
        l2 = l2.next;
      }
    }
    return dummy.next;

  }

}

class ListNode {
  int val;
  ListNode next;

  ListNode(int x) {
    val = x;
  }
}