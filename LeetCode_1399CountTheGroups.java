public class LeetCode_1399CountTheGroups {
  public static void main(String[] args) {
    System.out.println(countLargestGroup(13));
  }

  public static int countLargestGroup(int n) {
    if (n < 10) {
      return n;
    }
    int gobalCount = 0;
    int i = 1;
    int count = 10;
    while (count != n) {
      int ans = getDigitSum(count);
      if (i == ans) {
        gobalCount++;
      }
      count++;
      i++;
    }
    return gobalCount;
  }

  public static int getDigitSum(int n) {
    int sum = 0;
    while (n != 0) {
      int rem = n % 10;
      sum += rem;
      n = n / 10;
    }
    return sum;
  }

}
