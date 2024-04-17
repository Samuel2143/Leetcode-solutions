// Time complexity: O(n)
// Space complexity: O(1)
// Problem link: https://leetcode.com/problems/longest-strictly-increasing-or-strictly-decreasing-subarray/description/

class Solution {
  public int longestMonotonicSubarray(int[] nums) {
      int increase = 1,decrease=1,max=Integer.MIN_VALUE,i,start=0;
      for(i=1;i<nums.length;i++){
          if(nums[i-1]<nums[i]){
              max = (i-start)+1;
              increase = Math.max(increase,max);
          }
          else{
              start=i;
          }
      }
      start=0;
      for(i=1;i<nums.length;i++){
          if(nums[i-1]>nums[i]){
              max = (i-start)+1;
              decrease = Math.max(decrease,max);
          }
          else{
              start=i;
          }
      }
      return Math.max(increase,decrease);
  }
}