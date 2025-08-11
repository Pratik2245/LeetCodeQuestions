public class LeetCode_560SubArrayWithSumK {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
    public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1); // for subarrays starting from index 0
        int count = 0, sum = 0;

        for (int num : nums) {
            sum += num;
            if (map.containsKey(sum - k)) {
                count += map.get(sum - k);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return count;
    }
}