// Time complexity: O(n)
// Space complexity: O(n)
// Problem link: https://leetcode.com/problems/left-and-right-sum-differences/description/

class Solution {
  public int[] leftRightDifference(int[] nums) {
      int i;
      for(i=1;i<nums.length;i++){
          nums[i]=nums[i-1]+nums[i];
      }
      int[] diff= new int[nums.length];
      int left=0,right;
      for(i=0;i<nums.length;i++){
          if(i>0) left = nums[i-1];
          right = nums[nums.length-1]-nums[i];
          diff[i]=Math.abs(right-left);
      }
      return diff;
  }
}