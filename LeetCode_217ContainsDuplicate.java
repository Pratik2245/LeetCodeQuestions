import java.util.HashSet;

public class LeetCode_217ContainsDuplicate {
  public static void main(String[] args) {
    int arr[] = { 1, 2, 3, 1 };
    boolean b = containsDuplicate(arr);
    System.out.println(b);
  }

  public static boolean containsDuplicate(int[] nums) {
    HashSet<Integer> hashSet = new HashSet<>();
    for (int num : nums) {
      if (hashSet.contains(num)) {
        return false;
      }
    }
    return true;
  }
}
