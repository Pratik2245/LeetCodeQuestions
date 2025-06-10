import java.util.Scanner;

public class LeetCode_118PascalsTriangle {
  public static void main(String[] args) {
    // Scanner scanner = new Scanner(System.in);
    // System.out.print("Enter number of rows for Pascal's Triangle: ");
    int rows = 5;

    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < rows - i - 1; j++) {
        System.out.print(" ");
      }

      int number = 1;
      for (int j = 0; j <= i; j++) {
        System.out.print(number + " ");
        number = number * (i - j) / (j + 1);
      }
      System.out.println();
    }

    // scanner.close();s
  }
}
