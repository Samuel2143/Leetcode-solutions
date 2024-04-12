// Time complexity: O(n)
// Space complexity: O(1)
// Problem link: https://leetcode.com/problems/max-consecutive-ones/description/

class Solution {
  public int findMaxConsecutiveOnes(int[] nums) {
      int count=0,i,max=0;
      for(i=0;i<nums.length;i++){
          if(nums[i]==1){
              count++;
          }
          max=Math.max(count,max);
          if(nums[i]==0){
              count=0;
          }
      }
      return max;
  }
}