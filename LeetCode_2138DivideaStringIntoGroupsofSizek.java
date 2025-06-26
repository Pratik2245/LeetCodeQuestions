import java.util.Arrays;

public class LeetCode_2138DivideaStringIntoGroupsofSizek {
  public static void main(String[] args) {
    String s = "abcdefghi";
    String arr[] = divideString(s, 3, 'x');
    System.out.println(Arrays.toString(arr));

  }

  public static String[] divideString(String s, int k, char fill) {
    int remainder = s.length() % k;
    if (remainder != 0) {
      int toFill = k - remainder;
      for (int i = 0; i < toFill; i++) {
        s += fill;
      }
    }
    int n = s.length() / k;
    String[] builder = new String[n];
    for (int i = 0; i < n; i++) {
      builder[i] = s.substring(i * k, i * k + k);
    }
    return builder;
  }
}