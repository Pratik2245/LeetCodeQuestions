public class LeetCode_1432MaxDifferenceYouCanGetFromChanginganInteger {
  public static void main(String[] args) {
    int num = 1234;
    String s = String.valueOf(num);
    int min = num, max = num;
    for (char ch : s.toCharArray()) {
      for (char j = '0'; j <= '9'; j++) {
        if (ch == j)
          continue;
        if (j == '0' && s.charAt(0) == ch)
          continue;
        String replaced = s.replace(ch, j);
        int ans = Integer.parseInt(replaced);
        min = Math.min(ans, min);
        max = Math.max(ans, max);
      }

    }
    System.out.println(min);
    System.out.println(max);
    System.out.println(max - min);
  }
}
