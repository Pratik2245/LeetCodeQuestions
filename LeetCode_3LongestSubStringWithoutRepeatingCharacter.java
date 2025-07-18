
public class LeetCode_3LongestSubStringWithoutRepeatingCharacter {
  public static void main(String[] args) {
    String s = "";
    int ans = lengthOfLongestSubstring(s);
    System.out.println(ans);
  }

  public static int lengthOfLongestSubstring(String s) {
    int arr[] = new int[128];
    int left = 0;
    int max = 0;
    for (int i = 0; i < s.length(); i++) {
      // char ch = s.charAt(i);
      arr[s.charAt(i)]++;
      // skip the duplicates
      while (arr[s.charAt(i)] > 1) {
        arr[s.charAt(left)]--;
        left++;
      }
      max = Math.max(max, i - left + 1);
    }
    return max;
  }

  public int anotherMethod(String s) {
    int arr[] = new int[26];
    int count = 0;
    int max = Integer.MIN_VALUE;
    for (int i = 0; i < s.length(); i++) {
      int ch = s.charAt(i);
      if (arr[ch - 'a'] == 0) {
        arr[ch - 'a'] = 1;
        count = count + 1;
      } else {
        count = 0;
      }
      max = Math.max(count, max);
    }
    return max;
  }
}
