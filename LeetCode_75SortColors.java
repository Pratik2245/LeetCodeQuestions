import java.util.Arrays;

public class LeetCode_75SortColors {
  public static void main(String[] args) {
    int nums[] = { 2, 0, 2, 1, 1, 0 };
    sortColors(nums);
    System.out.println(Arrays.toString(nums));
  }

  public static void sortColors(int[] nums) {
    int start = 0;
    int end = nums.length - 1;
    int mid = 0;
    while (mid <= end) {

      if (nums[mid] == 0) {
        int temp = nums[mid];
        nums[mid] = nums[start];
        nums[start] = temp;
        start++;
        mid++;
      } else if (nums[mid] == 2) {
        int temp = nums[mid];
        nums[mid] = nums[end];
        nums[end] = temp;
        end--;
      } else {
        mid++;
      }
    }
  }
}
