import java.util.ArrayList;
import java.util.List;

public class LeetCode_221SummaryRange {
  public static void main(String[] args) {
    int arr[] = { 0, 1, 2, 4, 5, 7 };
    List<String> list = summaryRanges(arr);
    System.out.println(list);
  }

  public static List<String> summaryRanges(int[] nums) {
    List<String> list = new ArrayList<>();
    if (nums.length == 0)
      return list;
    for (int i = 0; i < nums.length; i++) {
      StringBuilder sb = new StringBuilder();
      int start = nums[i];

      while (i < nums.length - 1 && nums[i] + 1 == nums[i + 1]) {
        i++;
      }

      int end = nums[i];
      if (start == end) {
        sb.append(start);
      } else {
        sb.append(start).append("->").append(end);
      }
      list.add(sb.toString());
    }
    return list;
  }
}
