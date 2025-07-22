public class LeetCode_60PermutationSequence {
  public static void main(String[] args) {
    String s = "abc";
    permuteSeq("", s);
  }

  public static void permuteSeq(String p, String up) {
    if (up.isEmpty()) {
      System.out.println(p);
      return;
    }
    char ch = up.charAt(0);
    for (int i = 0; i <= p.length(); i++) {
      String f = p.substring(0, i);
      String g = p.substring(i, p.length());
      permuteSeq(f + ch + g, up.substring(1));
    }
  }
}