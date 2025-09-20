public class LeetCode_287FindTheDuplicateNumber{
    public static void main(String[] args) {
     int arr[]={1,3,4,2,2};
     int ans=findDuplicate(arr);
     System.out.println(ans);
    }
    public static int findDuplicate(int[] nums) {
        // int i=0;
        // while (i<nums.length){
        //     int correct=nums[i]-1;
        //     if(nums[i]!=i+1) {
        //         if (nums[i] != nums[correct]) {
        //             int temp = nums[i];
        //             nums[i] = nums[correct];
        //             nums[correct] = temp;
        //         } else {
        //             return nums[i];
        //         }
        //      }else {
        //         i++;
        //     }
        // }
        // return -1;
        // other way to do it 
        boolean b[]=new boolean[nums.length];
        for(int i=0;i<nums.length;i++){
          if(b[nums[i]]){
            return nums[i];
          }
          b[nums[i]]=true;
        }
        return -1;
    }
}