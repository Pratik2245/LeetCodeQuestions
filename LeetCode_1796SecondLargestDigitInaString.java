public class LeetCode_1796SecondLargestDigitInaString {
  public static void main(String[] args) {
    String s = "dfa12321afd";
    int ans = secondHighest(s);
    System.out.println(ans);
  }

  public static int secondHighest(String s) {
    int maxLen = Integer.MIN_VALUE;
    int sec = -1, first = -1;
    for (char ch : s.toCharArray()) {
      if (Character.isDigit(ch)) {
        int num = ch - '0';
        if (num > first) {
          sec = first;
          first = num;
        } else {
          if (num < first && num > sec) {
            sec = num;
          }
        }
      }
    }
    return sec;
    // boolean b[] = new boolean[10];
    // for (char ch : s.toCharArray()) {
    // if (Character.isDigit(ch)) {
    // b[ch - '0'] = true;
    // }
    // }
    // int count = 0;
    // for (int i = 9; i >= 0; i--) {
    // if (b[i]) {
    // count++;
    // }
    // if (count == 2) {
    // return i;
    // }
    // }
    // return -1;
  }
}
