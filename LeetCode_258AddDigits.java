public class LeetCode_258AddDigits {
  public static void main(String[] args) {
    int num = 1;
    int ans = addDigits(num);
    System.out.println(ans);
  }

  public static int addDigits(int num) {
    // int sum = 0;
    // while (num >= 10) {
    // sum = 0;
    // while (num != 0) {
    // int rem = num % 10;
    // sum += rem;
    // num = num / 10;
    // }
    // num = sum;
    // }
    // return num;
    if (num == 0)
      return num;
    return 1 + (num - 1) % 9;

  }
}