public class LeetCode_461HammingDistance {
  public static void main(String[] args) {
    int x = 1, y = 4;
    int ans = x ^ y;
    int count = 0;
    while (ans != 0) {
      if ((ans & 1) == 1) {
        count++;
      }
      ans = ans >> 1;
    }
    System.out.println(count);

  }
}
