// Time complexity: O(nlogn)
// Space complexity: O(1)
// Problem link: https://leetcode.com/problems/squares-of-a-sorted-array/description/

class Solution {
  public int[] sortedSquares(int[] nums) {
      int i;
      for(i=0;i<nums.length;i++){
          nums[i]=nums[i]*nums[i];
      }
      Arrays.sort(nums);
      return nums;
  }
}