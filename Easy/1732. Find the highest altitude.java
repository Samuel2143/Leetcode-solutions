// Time complexity: O(n)
// Space complexity: O(n)
// Problem link: https://leetcode.com/problems/find-the-highest-altitude/description/

class Solution {
  public int largestAltitude(int[] gain) {
      int[] prefix = new int[gain.length+1];
      prefix[0]=0;
      int i,index=1,max=Integer.MIN_VALUE;
      for(i=0;i<gain.length;i++){
          prefix[index]=prefix[index-1]+gain[i];
          index++;
      }
      for(i=0;i<prefix.length;i++){
          max = Math.max(max,prefix[i]);
      }
      return max;
  }
}