import java.util.ArrayList;
import java.util.List;

public class Leetcode_682BaseBallGame {
  public static void main(String[] args) {
    // String ops[] = { "5", "2", "C", "D", "+" };
    String ops[] = { "5", "-2", "4", "C", "D", "9", "+", "+" };
    int ans = calPoints(ops);
    System.out.println(ans);
  }

  public static int calPoints(String[] operations) {
    List<Integer> list = new ArrayList<>();
    for (int i = 0; i < operations.length; i++) {
      String s = operations[i];
      switch (s) {
        case "C":
          if (list.isEmpty())
            break;
          list.remove(list.size() - 1);
          break;
        case "D":
          if (!list.isEmpty()) {
            list.add(list.get(list.size() - 1) * 2);
          }
          break;
        case "+":
          if (list.size() >= 2) {
            list.add(list.get(list.size() - 1) + list.get(list.size() - 2));
          }
          break;
        default:
          list.add(Integer.parseInt(s));
          break;
      }
    }
    int sum = 0;
    for (int i = 0; i < list.size(); i++) {
      sum += list.get(i);
    }
    System.out.println(list);
    return sum;
  }
}