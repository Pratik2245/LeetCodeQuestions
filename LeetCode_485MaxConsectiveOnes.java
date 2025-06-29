public class LeetCode_485MaxConsectiveOnes {
  public static void main(String[] args) {
    int nums[]={1,1,0,1,1,1};
    findMaxConsecutiveOnes(nums);
  }
  public static int findMaxConsecutiveOnes(int[] nums) {
        int count=0;
        int maxCount=0;
       for (int num : nums) {
         count = (num == 1) ? count + 1 : 0;
         maxCount = Math.max(maxCount, count);
       }
      return maxCount;
    }
}
