package Project.homeWork;

public class arraysthree {
  public static int maxProfit(int[] prices){
    int buy = prices[0];
    int profit = 0;
    int n = prices.length;
    for(int i = 1; i < n; i++){
      if(buy < prices[i]){
        profit = Math.max(prices[i] - buy, profit);
      }
      else {
        buy = prices[i];
      }
    }

    return profit;
  }
  public static void main(String[] args) {
    int prices[] ={7, 6, 4, 3, 1};
    System.out.println("Max profit is: " + maxProfit(prices));
  }
}
