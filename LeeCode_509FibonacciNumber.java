public class LeeCode_509FibonacciNumber {
  public static void main(String[] args) {
    int res = fib(3);
    System.out.println(res);
  }

  public static int fib(int n) {
    if (n <= 1) {
      return n;
    }
    int num1 = 0, num2 = 1;
    for (int i = 2; i <= n; i++) {
      int c = num1 + num2;
      num1 = num2;
      num2 = c;
    }
    return num2;
  }
}
