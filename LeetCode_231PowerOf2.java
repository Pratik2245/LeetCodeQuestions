public class LeetCode_231PowerOf2 {
  public static void main(String[] args) {
    boolean b = isPowerOfTwo(16);
    System.out.println(b);
  }

  public static boolean isPowerOfTwo(int n) {
    if (n <= 0) {
      return false;
    }
    return (n & (n - 1)) == 0;
  }
}
