public class LeetCode_268MissingNumber {
  public static void main(String[] args) {
    int arr[] = { 9, 6, 4, 2, 3, 5, 7, 0, 1 };
    int ans = missingNumber(arr);
    System.out.println(ans);
  }

  public static int missingNumber(int[] nums) {
    int ans = (nums.length * (nums.length + 1)) / 2;
    int sum = 0;
    for (int num : nums) {
      sum += num;
    }
    return ans - sum;
  }
}
