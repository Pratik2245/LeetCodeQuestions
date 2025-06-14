public class LeetCode_2566MaximumDifferencebyRemappingaDigit {
  public static void main(String[] args) {
    int s = 99999;
    minMaxDifference(s);
  }

  public static int minMaxDifference(int num) {
    int min = Integer.MAX_VALUE;
    int max = num;
    String s = String.valueOf(num);
    for (char ch : s.toCharArray()) {
      for (char ch2 = '0'; ch2 <= '9'; ch2++) {
        if (ch == ch2)
          continue;
        String replaced = s.replace(ch, ch2);
        int val = Integer.parseInt(replaced);
        max = Math.max(val, max);
        min = Math.min(val, min);
      }
    }
    System.out.println(min);
    System.out.println(max);
    System.out.println(max - min);
    return 1;
  }
}
