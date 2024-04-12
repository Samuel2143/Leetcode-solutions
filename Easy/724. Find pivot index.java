// Time complexity: O(n)
// Space complexity: O(1)
// Problem link: https://leetcode.com/problems/find-pivot-index/description/

class Solution {
  public int pivotIndex(int[] nums) {
      int i;
      for(i=1;i<nums.length;i++){
          nums[i]=nums[i-1]+nums[i];
      }
      int left=0,right=0;
      for(i=0;i<nums.length;i++){
          if(i>0){
              left = nums[i-1];
          }
          right = nums[nums.length-1]-nums[i];
          if(left==right) return i;
      }
      return -1;
  }
}