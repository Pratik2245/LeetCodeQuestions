import java.util.Arrays;

public class LeetCode_303ModifytheMatrix {
  public static void main(String[] args) {
    // int arr[][] = { { -1, 2, -1 }, { 1, -1, 6 }, { 7, 8, 9 } };
    // int arr[][] = { { 3, -1 }, { 5, 2 } };
    int arr[][] = { { 2, -1, 2, -1, 2 }, { 1, 0, -1, 2, -1 }, { 2, -1, -1, -1, 2 }, { 2, 1, 2, -1, 2 },
        { 0, 1, 0, 0, 0 }, { 0, 0, 0, 0, -1 }, { 2, -1, 2, 2, 0 }, { 0, 1, 0, 2, 2 }, { 2, 2, 0, 1, -1 } };

    modifiedMatrix(arr);
  }

  public static int[][] modifiedMatrix(int[][] matrix) {
    int count = 0;
    while (count < matrix[0].length) {
      int maxInCol = Integer.MIN_VALUE;
      for (int row = 0; row < matrix.length; row++) {
        if (matrix[row][count] != -1) {
          maxInCol = Math.max(maxInCol, matrix[row][count]);
        }
      }
      for (int row = 0; row < matrix.length; row++) {
        if (matrix[row][count] == -1) {
          matrix[row][count] = maxInCol;
        }
      }
      count = count + 1;
    }
    // for (int i = 0; i < matrix.length; i++) {
    // if (matrix[i][count] == -1 ) {
    // row = i;
    // col = count;
    // flag = true;
    // }
    // maxlen = Math.max(maxlen, matrix[i][count]);
    // }
    // if (flag)
    // matrix[row][col] = maxlen;
    // flag = false;
    // // System.out.println(maxlen);
    // count = count + 1;
    // }
    for (int i = 0; i < matrix.length; i++) {
      System.out.println(Arrays.toString(matrix[i]));
    }
    return new int[][] {};
  }
}
