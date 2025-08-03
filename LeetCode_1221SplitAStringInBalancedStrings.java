public class LeetCode_1221SplitAStringInBalancedStrings {
  public static void main(String[] args) {
    String s = "RLRRLLRLRL";
    int ans = balancedStringSplit(s);
    System.out.println(ans);
  }

  public static int balancedStringSplit(String s) {
    int count = 0;
    int temp = 0;
    for (char ch : s.toCharArray()) {
      if (ch == 'R')
        temp++;
      else
        temp--;
      if (temp == 0)
        count++;
    }
    return count;

  }
}
