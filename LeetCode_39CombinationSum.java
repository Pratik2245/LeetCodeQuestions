import java.util.ArrayList;
import java.util.List;

public class LeetCode_39CombinationSum {
  public static void main(String[] args) {
    int arr[] = { 2, 3, 6, 7 };
    int target = 7;
    List<List<Integer>> list = combinationSum(arr, target);
    System.out.println(list);
  }

  public static List<List<Integer>> combinationSum(int[] candidates, int target) {
    List<List<Integer>> list = new ArrayList<>();
    findCombination(list, candidates, target, 0, new ArrayList<>());
    return list;
  }

  private static void findCombination(List<List<Integer>> list, int[] candidates, int target, int start,
      List<Integer> current) {
    if (target == 0) {
      list.add(new ArrayList<>(current));
      return;
    }
    for (int i = start; i < candidates.length; i++) {
      if (candidates[i] <= target) {
        current.add(candidates[i]);
        findCombination(list, candidates, target - candidates[i], i, current);
        current.remove(current.size() - 1);
      }
    }
  }
}
