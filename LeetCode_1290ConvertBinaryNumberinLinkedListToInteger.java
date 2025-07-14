public class LeetCode_1290ConvertBinaryNumberinLinkedListToInteger {
  public static void main(String[] args) {
    System.out.println("Hello, World!");
  }

  // ! brute Froce
  public int getDecimalValue(ListNode head) {
    String s = "";
    while (head != null) {
      s += head.val;
      head = head.next;
    }
    int ans = BinaryToDeci(s, 0);
    return ans;

  }

  public int BinaryToDeci(String s, int base) {
    int ans = 0;
    for (int i = s.length() - 1; i >= 0; i--) {
      ans += Math.pow(2, base) * Character.getNumericValue(s.charAt(i));
      base++;
    }
    return ans;
  }
  // ! 2nd way
  // optimal way
  // public int getDecimalValue(ListNode head) {
  // int ans = 0;
  // while (head != null) {
  // ans = ans * 2 + head.val;
  // head = head.next;
  // }
  // return ans;
  // }
}