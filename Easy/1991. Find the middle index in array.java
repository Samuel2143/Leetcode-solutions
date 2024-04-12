// Time complexity: O(n)
// Space complexity: O(1)
// Problem link: https://leetcode.com/problems/find-the-middle-index-in-array/description/

class Solution {
  public int findMiddleIndex(int[] nums) {
      int i;
      for(i=1;i<nums.length;i++){
          nums[i]=nums[i-1]+nums[i];
      }
      int left=0,right;
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