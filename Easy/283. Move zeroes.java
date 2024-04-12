// Time complexity: O(n)
// Space complexity: O(1)
// Problem link: https://leetcode.com/problems/move-zeroes/description/

class Solution {
  public void moveZeroes(int[] nums) {
      int index = 0,zero = 0,temp;
      while(index<nums.length){
          if(nums[zero]==0 && zero!=index && nums[index]!=0){
              temp = nums[zero];
              nums[zero] = nums[index];
              nums[index] = temp;
              zero++;
          }
          else if(nums[zero]!=0) zero++;
          index++;
      };
  }
}
