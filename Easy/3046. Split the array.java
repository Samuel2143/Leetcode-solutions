// Time complexity: O(nlogn)
// Space complexity: O(1)
// Problem link: https://leetcode.com/problems/split-the-array/description/

class Solution {
  public boolean isPossibleToSplit(int[] nums) {
      if(nums.length%2 != 0) return false;
      int start = 0;
      int end = 1;
      int count=0;
      Arrays.sort(nums);
      for(int i=1;i<nums.length;i++){
          if(nums[i]==nums[i-1]) count++;
          else if(nums[i]!=nums[i-1]) count=0;
          if (count>=2) return false;
      }
      return true;
  }
}