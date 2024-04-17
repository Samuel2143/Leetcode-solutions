// Time complexity: O(nlogn)
// Space complexity: O(1)
// Problem link: https://leetcode.com/problems/apple-redistribution-into-boxes/description/

class Solution {
  public int minimumBoxes(int[] apple, int[] capacity) {
      int apples = 0,i,total=0,sum=0;
      for(i=0;i<apple.length;i++){
          apples = apples + apple[i];
      }
      Arrays.sort(capacity);
      for(i=capacity.length-1;i>=0;i--){
          if(sum>=apples){
              return total;
          }
          else{
              sum = sum+capacity[i];
              total++;
          }
      }
      return total;
  }
}