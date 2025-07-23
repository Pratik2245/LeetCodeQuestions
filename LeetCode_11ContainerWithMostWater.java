public class LeetCode_11ContainerWithMostWater {
  public static void main(String[] args) {
    // int arr[] = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
    int arr[] = { 2, 3, 10, 5, 7, 8, 9 };
    int ans = maxArea(arr);
    System.out.println(ans);
  }

  public static int maxArea(int[] height) {
    // int width, minHeight = 0;
    int maxArea = 0;
    int area = 0;
    int left = 0, right = height.length - 1;
    while (left < right) {
      // minHeight = Math.min(height[left], height[right]);
      // width = right - left;
      // area = (right - left) * Math.min(height[left], height[right]);
      maxArea = Math.max((right - left) * Math.min(height[left], height[right]), maxArea);
      if (height[left] < height[right]) {
        left++;
      } else {
        right--;
      }
      // int ans = (height[left] < height[right]) ? left++ : right--;
    }
    return maxArea;
  }
}
