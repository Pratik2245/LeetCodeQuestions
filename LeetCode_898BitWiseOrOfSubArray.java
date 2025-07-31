import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LeetCode_898BitWiseOrOfSubArray {
  public static void main(String[] args) {
    int arr[] = { 1, 1, 2 };
    int ans = subarrayBitwiseORs(arr);
    System.out.println(ans);
  }

  public static int subarrayBitwiseORs(int[] arr) {
    Set<Integer> result = new HashSet<>();
    for (int i = 0; i < arr.length; i++) {
      result.add(arr[i]);
      System.out.println(result);
      for (int j = i - 1; j >= 0; j--) {
        if (arr[j] == (arr[j] | arr[i]))
          break;
        arr[j] |= arr[i];
        result.add(arr[j]);
      }
    }
    return result.size();

    // Set<Integer> result = new HashSet<>();
    // Set<Integer> prev = new HashSet<>();
    // for (int num : arr) {
    // Set<Integer> curr = new HashSet<>();
    // curr.add(num);
    // for (int val : prev) {
    // curr.add(val | num);
    // }
    // result.addAll(curr);
    // prev = curr;
    // }
    // return result.size();
  }
}