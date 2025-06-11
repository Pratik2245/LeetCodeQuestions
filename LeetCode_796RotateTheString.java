public class LeetCode_796RotateTheString {
  public static void main(String[] args) {
    String s = "abcde", goal = "cdeab";
    boolean b = rotateString(s, goal);
    System.out.println(b);
  }

  public static boolean rotateString(String s, String goal) {
    // String newString;
    // System.out.println(s + s);
    // for (int i = 0; i < s.length(); i++) {
    // newString = s.substring(i) + s.substring(0, i);
    // if (newString.equals(goal))
    // return true;
    // }
    // return false;

    // or
    return s.length() == goal.length() && (s + s).contains(goal);
  }
}
