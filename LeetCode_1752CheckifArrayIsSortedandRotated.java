public class LeetCode_1752CheckifArrayIsSortedandRotated {
  public static void main(String[] args) {
    int nums[]={3,4,5,1,2};
    boolean b=check(nums);
    System.out.println(b);
  }
//   ✅ Summary
// The drop count is the core logic:
// 0 drops → already sorted →  valid

// 1 drop → sorted and rotated →  valid

// >1 drops → breaks sorted order in multiple places →  invalid
  public static boolean check(int[] nums) {
      int count = 0;
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            int curr = nums[i];
            int next = nums[(i + 1) % n]; // Circular comparison
            System.out.println(next);
            if (curr > next) {
                count++;  // found a drop
            }
        }

        return count <= 1;
  }  

  
}
