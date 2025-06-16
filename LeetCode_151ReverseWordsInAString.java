import java.util.Arrays;

public class LeetCode_151ReverseWordsInAString {
  public static void main(String[] args) {
    String s = "  Hello   world   ";
    String[] words = s.trim().split("\\s+"); // Removes leading/trailing and multiple spaces
    System.out.println(Arrays.toString(words));
    StringBuilder builder = new StringBuilder();
    for (int i = words.length - 1; i >= 0; i--) {
      builder.append(words[i] + " ");
    }
    System.out.println(builder);

  }
}
