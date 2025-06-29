import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode_3LongestSubStringWithoutRepeatingCharacter {
  public static void main(String[] args) {
    String s = "abcabcbb";
    int ans = lengthOfLongestSubstring(s);
    System.out.println(ans);
  }

  public static int lengthOfLongestSubstring(String s) {
    int lastSeen[] = new int[128];
    // i have to set all to -1 beacuse asccii starts from 0 to 127;
    Arrays.fill(lastSeen, -1);
    int maxLength = 0;
    int left = 0;

    for (int right = 0; right < s.length(); right++) {
      char c = s.charAt(right);

      // Step 2: if character was seen and it's within the current window
      if (lastSeen[c] >= left) {
        left = lastSeen[c] + 1; // move the left pointer
        System.out.println("Left=" + left);
        System.out.println("lastSeen=" + lastSeen[c]);
      }

      // Step 3: update last seen index of current character
      lastSeen[c] = right;

      // Step 4: calculate max length
      maxLength = Math.max(maxLength, right - left + 1);
    }
    return 0;

  }
}
