// Time complexity: O(n)
// Space complexity: O(1)
// Problem link: https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/

class Solution {
  public int maxProfit(int[] prices) {
      int cheap = prices[0],prof=0,i;
      for(i=1;i<prices.length;i++){
          if(prices[i]<cheap){
              cheap = prices[i];
          }
          else{
              if(prices[i]-cheap>prof){
                  prof = prices[i]-cheap;
              }
          }
      }
      return prof;
  }
}