import java.util.*;
public class LeetCode_3005CountElementsWithMaximumFrequency {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        int ans=maxFrequencyElements(nums);
        System.out.println(ans);
    }
     public static int maxFrequencyElements(int[] nums) {
        int freq[] =new int[101];
        int count=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            freq[nums[i]]++;
            max=Math.max(max,freq[nums[i]]);
        }
        System.out.println(Arrays.toString(freq));
        for(int i=0;i<nums.length;i++){
            if(freq[nums[i]]==max){
                count++;
            }
        }
        return count;

    }
}