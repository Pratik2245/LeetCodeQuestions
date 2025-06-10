public class LeetCode_8StringToInteger {
  public static void main(String[] args) {
    String s = "    -042";
    String t = s.trim();
    System.out.println(t);
    System.out.println(Integer.parseInt(t));
  }
}