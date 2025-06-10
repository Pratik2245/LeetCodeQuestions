public class LeetCode925LongPressedName {
  public static void main(String[] args) {
    String name = "alex", typed = "aaleexa";
    boolean b = isLongPressedName(name, typed);
    System.out.println(b);
  }

  public static boolean isLongPressedName(String name, String typed) {
    int start = 0;
    int start2 = 0;
    // while (start < name.length() && start2 < typed.length()) {
    // if (name.charAt(start) == typed.charAt(start2)) {
    // while (start2 < typed.length() && name.charAt(start) == typed.charAt(start2))
    // {
    // start2++;
    // }
    // System.out.println("hello");
    // start++;
    // } else {
    // return false;
    // }

    // }
    // return true;
    // single loop solution
    while (start2 < typed.length()) {
      if (start < name.length() && name.charAt(start) == typed.charAt(start2)) {
        start++;
        start2++;
      } else if (start2 > 0 && typed.charAt(start2) == typed.charAt(start2 - 1)) {
        start2++;
      } else {
        return false;
      }

    }
    return start == name.length();
  }
}