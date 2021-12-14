// https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
public class Stock_Buy_Sell{
    class Solution {
    public int maxProfit(int[] arr) {
      int profit = 0,min = arr[0];
      for(int i = 0;i < arr.length;i++){

          if(min > arr[i]) min = arr[i];
          if(profit < arr[i]-min) profit = arr[i] - min;

        }
        
        return profit;
        
    }
}
}