public class LeetCode_81SearchInRotatedSortedArrayII{
    public static void main(String[] args) {
      int arr[]={2,5,6,0,0,1,2};
      boolean ans=search(arr,0);
      System.out.println(ans);
    }
    public static boolean search(int[] nums, int target) {
        int start = 0, end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                return true;
            }
            if(nums[mid]==nums[start] && nums[mid]==nums[end]){
                start++;
                end--;
            }

            // Left half is sorted
            if (nums[start] <= nums[mid]) {
                if (target >= nums[start] && target < nums[mid]) {
                    end = mid-1;   // search left
                } else {
                    start = mid + 1; // search right
                }
            }
            // Right half is sorted
            else {
                if (target > nums[mid] && target <= nums[end]) {
                    start = mid + 1; // search right
                } else {
                    end = mid - 1;   // search left
                }
            }
        }

        return false;
    }
} 