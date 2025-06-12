import java.util.Arrays;

public class LeetCode_3445MaximumDifferenceBetweenEvenandOddFrequencyII {
  public static void main(String[] args) {
    int ans = maxDifference("12233", 4);
    System.out.println(ans);
  }

  public static int maxDifference(String s, int k) {
    int arr[] = new int[9];
    for (int i = 0; i < s.length(); i++) {
      int a = s.charAt(i) - '0';
      arr[a] += 1;
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

    System.out.println(Arrays.toString(arr));
    return 0;
  }
}
