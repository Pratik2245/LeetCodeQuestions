public class LeetCode_121BestTimeToButAndSellStocks {
  public static void main(String[] args) {
    int arr[] = { 7, 1, 5, 3, 6, 4 };
    int ans = maxProfit(arr);
    System.out.println(ans);
  }

  public static int maxProfit(int[] arr) {
    int profit = 0;
    int buy = arr[0];
    for (int i = 1; i < arr.length; i++) {
      if (arr[i] < buy) {
        buy = arr[i];
      } else if (arr[i] - buy > profit) {
        profit = arr[i] - buy;
      }
    }
    return profit;
  }
}
