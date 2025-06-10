public class LeetCode_42TappingRainWater {
  public static void main(String[] args) {
    // int arr[] = { 4, 2, 0, 6, 3, 2, 5 };
    int arr[] = { 4, 2, 0, 3, 2, 5 };
    int ans = calculateRainWater(arr);
    System.out.println(ans);
  }
  public static int calculateRainWater(int arr[]) {
    if (arr.length <= 2)
      return 0;
    int totalSum = 0;
    int left[] = new int[arr.length];
    int right[] = new int[arr.length];
    int max = 0;
    int max2 = 0;
    for (int i = 0; i < arr.length; i++) {
      max = Math.max(max, arr[i]);
      left[i] = max;
      int j = arr.length - 1 - i;
      max2 = Math.max(max2, arr[j]);
      right[j] = max2;
    }
    for (int i = 0; i < right.length; i++) {
      int min = Math.min(left[i], right[i]);
      totalSum += min - arr[i];
    }
    return totalSum;
  }
}
