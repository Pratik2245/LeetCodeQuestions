public class LeetCode_2348NumberofZeroFilledSubarrays {
    public static void main(String[] args) {
      int nums[]={1,3,0,0,2,0,0,4};
      long ans=zeroFilledSubarray(nums);
      System.out.println(ans); 
    }
    public static long zeroFilledSubarray(int[] nums) {
//       long count=0;
//        for (int i = 0; i < nums.length; i++) {
//            if(nums[i]==0) {
//                for (int j = i; j < nums.length; j++) {
//                    if (nums[j] == 0 ) {
//                        count += 1;
//                    } else {
//                        break;
//                    }
//                }
//            }
//        }
//        System.out.println(count);
//        return count;
        long count = 0, streak = 0;

        for (int num : nums) {
            if (num == 0) {
                streak++;
                count += streak; // add subarrays ending here
            } else {
                streak = 0; // reset when non-zero found
            }
        }
        return count;


    }
}