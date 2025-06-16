public class LeetCode_74SearchIn2DMatrix {
  public static void main(String[] args) {
    int arr[][] = { { 1, 3, 5, 7 }, { 10, 11, 16, 20 }, { 23, 30, 34, 6 } };
    int target = 3;
    boolean ans = searchMatrix(arr, target);
    System.out.println(ans);
  }

  public static boolean searchMatrix(int[][] matrix, int target) {
    int start = 0;
    int col = matrix.length;
    int row = matrix[0].length;
    System.out.println(row);
    int end = col * row - 1;
    while (start <= end) {
      int mid = start + (end - start) / 2;
      int midValue = matrix[mid / row][mid % row];
      if (midValue == target) {
        return true;
      } else if (midValue < target) {
        start = mid + 1;
      } else {
        end = mid - 1;
      }
    }
    return false;
  }
}
