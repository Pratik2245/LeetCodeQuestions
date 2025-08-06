import java.util.Arrays;
public class LeetCode_2149RearrangeArrayElementsBySign {
    public static void main(String[] args) {
        int nums[]= {3,1,-2,-5,2,-4};
//        int arr[]=rearrangeArray(nums);
        int arr[]=rearrangeArrayOpt(nums);
        System.out.println(Arrays.toString(arr));
    }
    
    public static int[] rearrangeArrayOpt(int[] nums) {
        int newArr[]=new int[nums.length];
        int cP=0,cN=1;
        for (int i = 0; i < nums.length; i++) {
            if(cP<nums.length &&nums[i]>0){
                newArr[cP]=nums[i];
                cP+=2;
            }else if(cN<nums.length && nums[i]<0){
                newArr[cN]=nums[i];
                cN+=2;
            }
        }
        return newArr;
    }

}