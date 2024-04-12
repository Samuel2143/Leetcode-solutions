// Time complexity: O(n)
// Space complexity: O(1)
// Problem link: https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/description/

class Solution {
  public List<Integer> findDisappearedNumbers(int[] nums) {
      int i=0;
      ArrayList<Integer> arr = new ArrayList<>(); 
      while(i<nums.length){
          int correct = nums[i]-1;
          if(nums[i]!=nums.length+1 && nums[i]!=nums[correct]){
              int temp = nums[correct];
              nums[correct] = nums[i];
              nums[i] = temp;
          }
          else
              i++;
      }

      for(i=0;i<nums.length;i++){
          if(nums[i]!=i+1)
              arr.add(i+1);
      }
      return arr;
  }
}