import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LeetCode_888FairCandySwap {
  public static void main(String[] args) {
    int arr1[] = { 1, 1 };
    int arr2[] = { 2, 2 };
    int res[] = fairCandySwap(arr1, arr2);
    System.out.println(Arrays.toString(res));
  }

  public static int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {

    // int Sum1 = 0;
    // int Sum2 = 0;
    // for (int a : aliceSizes)
    // Sum1 += a;
    // for (int b : bobSizes)
    // Sum2 += b;

    // int delta = (Sum2 - Sum1) / 2;

    // for (int a : aliceSizes) {
    // for (int b : bobSizes) {
    // if (b - a == delta) {
    // return new int[] { a, b };
    // }
    // }
    // }
    // return new int[0];
    int sum1 = 0, sum2 = 0;

    for (int a : aliceSizes)
      sum1 += a;
    for (int b : bobSizes)
      sum2 += b;

    int delta = (sum2 - sum1) / 2;

    Set<Integer> bobSet = new HashSet<>();
    for (int b : bobSizes) {
      bobSet.add(b);
    }

    for (int a : aliceSizes) {
      int b = a + delta;
      if (bobSet.contains(b)) {
        return new int[] { a, b };
      }
    }

    return new int[0];
  }
}