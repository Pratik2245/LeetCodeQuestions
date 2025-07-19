import java.util.ArrayList;
import java.util.List;

public class LeetCode_78SubsSets {
  public static void main(String[] args) {
    int arr[] = { 1, 2, 3 };
    List<List<Integer>> list = subsets(arr);
    for (int i = 0; i < list.size(); i++) {
      System.out.println(list.get(i));
    }
  }

  public static List<List<Integer>> subsets(int[] nums) {
    List<List<Integer>> ansList = new ArrayList<>();
    List<Integer> small = new ArrayList<>();
    helperFun(ansList, 0, nums, small);
    return ansList;
  }

  public static void helperFun(List<List<Integer>> list, int start, int nums[], List<Integer> smallList) {
    if (start == nums.length) {
      list.add(new ArrayList<>(smallList));
      return;
    }
    smallList.add(nums[start]);
    helperFun(list, start + 1, nums, smallList);
    smallList.remove(smallList.size() - 1);
    helperFun(list, start + 1, nums, smallList);

  }
}
