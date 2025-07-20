import java.util.Arrays;

public class LeetCode_4MedianOfSortedArray {
  public static void main(String[] args) {
    int nums1[] = { 1, 2 };
    int nums2[] = { 3, 4 };
    // int nums1[] = { -5, 3, 6 };
    // int nums2[] = { -2, 4, 10 };
    // # Output: 11.0

    double ans = findMedianSortedArrays(nums1, nums2);
    System.out.println(ans);

  }

  public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
    int newArr[] = new int[nums1.length + nums2.length];
    int i = 0, j = 0;
    int k = 0;
    while (i < nums1.length && j < nums2.length) {
      if (nums1[i] > nums2[j]) {
        newArr[k++] = nums2[j++];
      } else {
        newArr[k++] = nums1[i++];
      }
    }
    while (i < nums1.length) {
      newArr[k++] = nums1[i++];
    }
    while (j < nums2.length) {
      newArr[k++] = nums2[j++];
    }
    if ((newArr.length) % 2 == 1) {
      System.out.println(newArr.length - 1);
      return newArr[newArr.length / 2];
    } else {
      return (newArr[(newArr.length / 2) - 1] + newArr[newArr.length / 2]) / 2.0;
    }
  }
}
