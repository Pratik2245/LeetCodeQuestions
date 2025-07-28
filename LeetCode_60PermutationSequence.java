import java.util.ArrayList;
import java.util.List;

public class LeetCode_60PermutationSequence {
  public static void main(String[] args) {
    String s = "abc";
    int arr[] = { 1, 2, 3 };
    // permuteSeq("", s);
    List<List<Integer>> list = permute(arr);
    for (int i = 0; i < arr.length; i++) {
      System.out.println(list.get(i));
    }

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

  public static List<List<Integer>> permute(int[] nums) {
    List<List<Integer>> result = new ArrayList<>();
    boolean[] used = new boolean[nums.length];
    List<Integer> current = new ArrayList<>();
    backTrack(result, used, current, nums);
    return result;
  }

  public static void backTrack(List<List<Integer>> result, boolean[] used, List<Integer> current, int[] nums) {
    if (current.size() == nums.length) {
      result.add(new ArrayList<>(current));
      return;
    }
    for (int i = 0; i < nums.length; i++) {
      if (!used[i]) {
        used[i] = true;
        current.add(nums[i]);
        backTrack(result, used, current, nums);

        used[i] = false;
        current.remove(current.size() - 1);
      }
    }
  }
}