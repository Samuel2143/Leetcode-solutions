// Time complexity: O(nlogn)
// Space complexity: O(1)
// Problem link: https://leetcode.com/problems/majority-element/description/

class Solution {
  public int majorityElement(int[] nums) {
      if(nums.length==1) return nums[0];
      Arrays.sort(nums);
      int count=0,max=0,i,value=0;
      for(i=0;i<nums.length-1;i++){
          if(nums[i]==nums[i+1]){
              count++;
          }
          else{
              count=0;
          }
          if(count>max){
              max = count;
              value = nums[i];
          }
      }
      return value;
  }
}
