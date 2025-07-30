import java.util.Stack;

public class LeetCode_20ValidParenthesis {
  public static void main(String[] args) {
    String s = "()";
    isValid(s);
  }

  public static boolean isValid(String s) {
    Stack<Character> stack = new Stack();
    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
        stack.push(s.charAt(i));
      } else {
        if (stack.isEmpty()) {
          return false;
        }
      char top = stack.pop();
      if()
        
      }
    }
  }
}
