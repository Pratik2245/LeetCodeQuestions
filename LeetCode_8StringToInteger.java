public class LeetCode_8StringToInteger {
  public static void main(String[] args) {
    // System.out.println(myAtoi("42")); // 42
    System.out.println(myAtoi("   -042")); // -42
    // System.out.println(myAtoi("1337c0d3")); // 1337
    // System.out.println(myAtoi("0-1")); // 0
    // System.out.println(myAtoi("words 987")); // 0
    // System.out.println(myAtoi("9999999999"));

  }

  public static int myAtoi(String s) {
    int i = 0;
    long result = 0;
    int sign = 1, n = s.length();
    // removing the spaces
    while (i < n && s.charAt(i) == ' ') {
      i++;
    }

    // checking the signs of the digits
    if (i < n && s.charAt(i) == '+' || s.charAt(i) == '-') {
      sign = (s.charAt(i) == '+') ? 1 : -1;
      i++;
    }

    // converting into digits
    while (i < n && Character.isDigit(s.charAt(i))) {
      int digit = s.charAt(i) - '0';
      result = result * 10 + digit;

      if (sign == 1 && result > Integer.MAX_VALUE) {
        return Integer.MAX_VALUE;
      } else if (sign == -1 && -result < Integer.MIN_VALUE) {
        return Integer.MIN_VALUE;
      }
      i++;
    }
    return (int) (sign * result);
  }
}