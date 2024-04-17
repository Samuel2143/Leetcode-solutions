// Time complexity: O(n)
// Space complexity: O(1)
// Problem link: https://leetcode.com/problems/time-needed-to-buy-tickets/description/

class Solution {
  public int timeRequiredToBuy(int[] tickets, int k) {
      int time=0,i=0;
      while(i<tickets.length){
          if(tickets[i]<=tickets[k]){
              time+=tickets[i];
              tickets[i]-=tickets[i];                
          }
          else{
              time+=tickets[k]-1;
              tickets[i]-=tickets[k];
          }
          if(tickets[k]==0) return time;
          i++;
      }
      return time;
  }
}
