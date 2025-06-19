import java.util.Arrays;

//? we solve using the logic of drops 
// The drop count is the core logic:
// 0 drops → already sorted → ✅ valid

// 1 drop → sorted and rotated → ✅ valid

// >1 drops → breaks sorted order in multiple places → ❌ invalid
public class LeetCode_189RotateArray {
  public static void main(String[] args) {
    int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
    // int arr[] = { -1 };
    int k = 3;
    rotate(arr, k);
  }

  public static void rotate(int[] nums, int k) {
    k = k % nums.length;
    System.out.println(k);
    // reverse the whole array
    reverseArray(nums, 0, nums.length - 1);
    // reverse till the k
    reverseArray(nums, 0, k - 1);

    reverseArray(nums, k, nums.length - 1);
    System.out.println(Arrays.toString(nums));
  }

  public static void reverseArray(int arr[], int start, int end) {
    while (start < end) {
      int temp = arr[start];
      arr[start] = arr[end];
      arr[end] = temp;
      start++;
      end--;
    }
  }
}
