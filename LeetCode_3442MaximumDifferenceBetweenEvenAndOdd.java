import java.util.Arrays;

public class LeetCode_3442MaximumDifferenceBetweenEvenAndOdd {
  public static void main(String[] args) {
    // String s = "aaaaabbc";
    String s = "abcabcab";
    int ans = maxDifference(s);
    System.out.println(ans);
  }

  public static int maxDifference(String s) {
    int arr[] = new int[26];
    for (int i = 0; i < s.length(); i++) {
      char ch = s.charAt(i);
      arr[ch - 'a'] += 1;
    }
    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > 0) {
        if (arr[i] % 2 == 0) {
          min = Math.min(min, arr[i]);
        } else {
          max = Math.max(max, arr[i]);
        }
      }
    }

    return max - min;
  }
}
