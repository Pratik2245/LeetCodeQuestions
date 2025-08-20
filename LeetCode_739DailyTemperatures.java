import java.util.*;
public class LeetCode_739DailyTemperatures {
    public static void main(String[] args) {
       int[] temperatures = {73,74,75,71,69,72,76,73};
       int ans[]=dailyTemperatures(temperatures);
       System.out.println(Arrays.toString(ans));
    }
    public static int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> s=new Stack<>();
        int result[]=new int[temperatures.length];
        for (int i = 0; i < temperatures.length; i++) {
            while(!s.isEmpty() && temperatures[i]>temperatures[s.peek()]){
                int peekEle=s.pop();
                result[peekEle]=i-peekEle;
            }
            s.push(i);
        }
        return result;
    }
}