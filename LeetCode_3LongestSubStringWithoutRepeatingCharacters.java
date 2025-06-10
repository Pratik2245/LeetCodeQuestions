public class LeetCode_3LongestSubStringWithoutRepeatingCharacters {
  public static void main(String[] args) {
    String s = "abcabcbb";
    int ans = lengthOfLongestSubstring(s);
    System.out.println(ans);

  }

  public static int lengthOfLongestSubstring(String s) {
    int lastSeen[] = new int[256];
    for (int i = 0; i < lastSeen.length; i++) {
      lastSeen[i] = -1;
    }
    int maxLength = 0; // Final answer
    int start = 0; // Start of current window

    for (int end = 0; end < s.length(); end++) {
      char currentChar = s.charAt(end);

      // If the current character was seen and is inside the current window
      if (lastSeen[currentChar] >= start) {
        start = lastSeen[currentChar] + 1; // Move start right after previous occurrence
      }

      lastSeen[currentChar] = end; // Update last seen index of current character
      System.out.println(lastSeen[currentChar]);
      maxLength = Math.max(maxLength, end - start + 1); // Update max length
    }

    return maxLength;
  }
}
