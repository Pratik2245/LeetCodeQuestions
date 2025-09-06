class ListNode {
    int val;
    ListNode next;

    ListNode() {}
    ListNode(int val) {
        this.val = val;
    }
    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
public class LeetCode_1669MergeInBetweenLinkedLists {
    public static void main(String[] args) {
        // you can create sample lists here and test
        ListNode list1 = new ListNode(0, new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4)))));
        ListNode list2 = new ListNode(1000000, new ListNode(1000001));

        int a = 1, b = 3;


        ListNode result = mergeInBetween(list1, a, b, list2);

        // Print result
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
    public static ListNode mergeInBetween(ListNode list1,int a,int b,ListNode list2){
        ListNode prev=list1;
        for(int i=0;i<a-1;i++){
            prev=prev.next;
        }
        ListNode afterA=prev;
        for(int i=a;i<=b;i++){
            afterA=afterA.next;
        }
        prev.next=list2;
        ListNode tail=list2;
        while (prev.next!=null){
//            tail=tail.next;
           prev= prev.next;
        }
        prev.next=afterA.next;
        return list1;
    }
}
