public class LeetCode_345ReverseVowelsOfString {
  public static void main(String[] args) {
    String s = reverseVowels("leetcode");
    System.out.println(s);
  }

  public static String reverseVowels(String s) {
    int left = 0;
    int right = s.length() - 1;
    char ch[] = s.toCharArray();

    while (left < right) {
      while (left < right && !isVowel(s.charAt(left))) {
        left++;
      }
      while (right > left && !isVowel(s.charAt(right))) {
        right--;
      }
      System.out.println(left);
      System.out.println(right);
      char temp = ch[left];
      ch[left] = ch[right];
      ch[right] = temp;
      left++;
      right--;
    }

    return new String(ch);
  }

  public static boolean isVowel(char ch) {
    ch = Character.toLowerCase(ch);
    return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
  }
}