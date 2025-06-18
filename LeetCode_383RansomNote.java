import java.util.Arrays;

public class LeetCode_383RansomNote {
  public static void main(String[] args) {
    String ransomNote = "hello", magazine = "helo";
    boolean b = canConstruct(ransomNote, magazine);
    System.out.println(b);
  }

  public static boolean canConstruct(String ransomNote, String magazine) {
    int arr[] = new int[26];
    for (char ch : magazine.toCharArray()) {
      arr[ch - 'a']++;
    }
    for (char ch : ransomNote.toCharArray()) {
      if (arr[ch - 'a'] == 0)
        return false;
      arr[ch - 'a']--;
    }
    return true;
  }
}