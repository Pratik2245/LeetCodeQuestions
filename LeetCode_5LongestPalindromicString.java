public class LeetCode_5LongestPalindromicString {
  public static void main(String[] args) {
    String s = "babad"
    String ans=longestPalindrome(s);
  }
     public static String longestPalindrome(String s) {
      for (int i = 0; i < s.length(); i++) {
        char ch=s.charAt(i);
        int j=i+1;
        while (j<s.length() && s.charAt(j)!=ch) {
          j++;
        }
        while (s.charAt(j)==s.charAt(i)) {
          
        }
      }
        
    }
}
