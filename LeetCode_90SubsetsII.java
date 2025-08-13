import java.util.*;
public class LeetCode_90SubsetsII {
    public static void main(String[] args) {
        int arr[]={1,2,2};
//        using list
        Arrays.sort(arr);
        List<List<Integer>> main= subSetUsingList(arr,0);
        System.out.println(main);
    }
    public static List<List<Integer>> subSetUsingList(int arr[],int start){
        List<List<Integer>> mainList=new ArrayList<>();
        List<Integer> subList=new ArrayList<>();
        helper(arr,start,mainList,subList);
        return mainList;
    }
    public static void helper(int arr[], int start, List<List<Integer>> mainList, List<Integer> subList) {
    mainList.add(new ArrayList<>(subList)); // Add current subset

    for (int i = start; i < arr.length; i++) {
        // Skip duplicates at the same level
        if (i > start && arr[i] == arr[i - 1]) {
            continue;
        }
        subList.add(arr[i]);
        helper(arr, i + 1, mainList, subList);
        subList.remove(subList.size() - 1);
        }
    }
}