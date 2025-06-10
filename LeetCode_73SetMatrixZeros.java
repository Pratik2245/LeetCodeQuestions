public class LeetCode_73SetMatrixZeros {
  public static void main(String args[]) {
    int matrix[][] = { { 1, 1, 1 }, { 1, 0, 1 }, { 1, 1, 1 } };
    setZeroes(matrix);
  }

  public static void setZeroes(int[][] matrix) {
    int newMatrix[][] = matrix;
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[0].length; j++) {
        if (matrix[i][j] == 0) {
          
        }
      }
    }
    for (int i = 0; i < newMatrix.length; i++) {
      for (int j = 0; j < newMatrix[0].length; j++) {
        System.out.print(newMatrix[i][j]);
      }
      System.out.println();
    }
  }
}