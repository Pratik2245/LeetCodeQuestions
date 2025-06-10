public class LeetCode_171ExcelSheetColumnNumber {
  public static void main(String[] args) {
    String columnTitle = "ABC";
    int result = 0;
    for (int i = 0; i < columnTitle.length(); i++) {
      char ch = columnTitle.charAt(i);
      result = result * 26 + (ch - 'A' + 1);
    }
    System.out.println(result);
  }
}
