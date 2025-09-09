import java.util.*;
public class LeetCode_56MergeIntervals {
    public static void main(String[] args) {
      int arr[][]={{1,3},{2,6},{8,9},{8,10},{2,4},{15,18},{16,17}};
        int arr2[][]=merge(arr);
        for(int i=0;i<arr2.length;i++){
            System.out.println(Arrays.toString(arr2[i]));
        }
    }
    public static int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
       List<int[]> list=new ArrayList<>();
       int[][] newArr =new int[intervals.length][intervals[0].length];
        int start=intervals[0][0];
        int end=intervals[0][1];
        for (int i = 1; i < intervals.length; i++) {
            if(end>=intervals[i][0]){
               end=Math.max(end,intervals[i][1]);
            }else{
                list.add(new int[]{start, end});
                start=intervals[i][0];
                end=intervals[i][1];
            }
        }
        list.add(new int[]{start,end});
        return list.toArray(new int[list.size()][]);
    }
}