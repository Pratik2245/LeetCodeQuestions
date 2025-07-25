public class LeetCode_27RemoveElement {
  public static void main(String[] args) {
    int arr[] = { 1 };
    int asn = removeElement(arr, 1);
    System.out.println(asn);
  }

  public static int removeElement(int[] nums, int val) {
    int left = 0, right = nums.length - 1;
    while (left < right) {
      if (nums[left] == val) {
        nums[left] = nums[right];
        right--;
      } else {
        left++;
      }
    }
    return right + 1;
  }
}