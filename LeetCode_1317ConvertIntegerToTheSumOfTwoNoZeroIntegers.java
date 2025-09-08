import java.util.*;
public class LeetCode_1317ConvertIntegerToTheSumOfTwoNoZeroIntegers {
    public static void main(String[] args) {
        int arr[]=getNoZeroIntegers(10);
        System.out.println(Arrays.toString(arr));
    }
    public static int[] getNoZeroIntegers(int n) {
        int a=n-1;
        int b=1;
        while(!notZero(a) || !notZero(b)){
            a--;
            b++;
        }
        return new int[]{a,b};
    }
    public static boolean notZero(int n){
        return !String.valueOf(n).contains("0");
    }
}