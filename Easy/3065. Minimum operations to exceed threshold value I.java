// Time complexity: O(n)
// Space complexity: O(1)
// Problem link: https://leetcode.com/problems/minimum-operations-to-exceed-threshold-value-i/description/

class Solution {
  public int minOperations(int[] nums, int k) {
      int count = 0,i;
      for(i=0;i<nums.length;i++){
          if(nums[i]<k) count++;
      }
      return count;
  }
}