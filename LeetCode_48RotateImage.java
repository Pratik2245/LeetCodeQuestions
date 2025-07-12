import java.util.Arrays;

public class LeetCode_48RotateImage {
  public static void main(String[] args) {
    int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
    rotate(arr);

  }

  public static void rotate(int[][] matrix) {
    for (int i = 0; i < matrix.length; i++) {
      for (int j = i; j < matrix[0].length; j++) {
        int temp = matrix[i][j];
        matrix[i][j] = matrix[j][i];
        matrix[j][i] = temp;
      }
    }
    // now reverse the matrix.
    
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[0].length / 2; j++) {
        int temp = matrix[i][j];
        matrix[i][j] = matrix[i][matrix[0].length - 1 - j];
        matrix[i][matrix[0].length - 1 - j] = temp;
      }
    }
    for (int[] row : matrix) {
      System.out.println(Arrays.toString(row));
    }
  }
}
