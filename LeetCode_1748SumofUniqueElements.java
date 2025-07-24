public class LeetCode_1748SumofUniqueElements {
  public static void main(String[] args) {
    int arr[] = { 1, 1, 1, 1, 1 };
    int ans = sumOfUnique(arr);
    System.out.println(ans);
  }

  public static int sumOfUnique(int[] nums) {
    int freq[] = new int[101];
    for (int num : nums) {
      freq[num]++;
    }
    int sum = 0;
    for (int i = 0; i < nums.length; i++) {
      if (freq[nums[i]] == 1) {
        sum += nums[i];
      }
    }
    return sum;
  }
}