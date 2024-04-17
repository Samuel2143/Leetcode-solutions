// Time complexity: O(n)
// Space complexity: O(1)
// Problem link: https://leetcode.com/problems/first-missing-positive/description/

class Solution {
  public int firstMissingPositive(int[] nums) {
     int i=0;
      while(i<nums.length){
          int correct = nums[i]-1;
          if(nums[i]>0 && nums[i]<nums.length && nums[i]!=nums[correct]){
              int temp = nums[correct];
              nums[correct]=nums[i] ;
              nums[i]=temp;                     
          }
          else{
              i++;
          }
      }
      for(i=0;i<nums.length;i++){
          if(nums[i]-1!=i)
              return i+1;
      }
      return nums.length+1;
  }
}