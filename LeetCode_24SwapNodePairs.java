public class LeetCode_24SwapNodePairs {
    public static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) {
          this.val = val; this.next = next;
      }
    }
    public static void main(String[] args) {
        ListNode one=new ListNode(1);
        ListNode two=new ListNode(2);
        ListNode three=new ListNode(3);
        ListNode four=new ListNode(4);
        ListNode head=one;
        one.next=two;
        two.next=three;
        three.next=four;
        four.next=null;
        ListNode head2=swapPairs(head);
        ListNode temp=head2;

        while (temp!=null){
            System.out.println(temp.val);
            temp=temp.next;
        }
    }
    public static ListNode swapPairs(ListNode head) {
      if(head.next==null ||head==null){
          return head;
      }
      ListNode dummy=new ListNode(0);
      dummy.next=head;
      ListNode prev=dummy;
      while ( prev.next!=null && prev.next.next!=null){
          ListNode current=prev.next;
          ListNode Next=current.next;
          current.next=Next.next;
          Next.next=current;
          prev.next=Next;

          prev=current;

      }
      return dummy.next;
    }
}