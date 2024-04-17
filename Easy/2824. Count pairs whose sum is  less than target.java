// Time complexity: O(n^2)
// Space complexity: O(1)
// Problem link: https://leetcode.com/problems/count-pairs-whose-sum-is-less-than-target/description/

class Solution {
  public int countPairs(List<Integer> nums, int target) {
      int count=0,i,j;
      for(i=0;i<nums.size();i++){
          for(j=i+1;j<nums.size();j++){
              if(nums.get(i)+nums.get(j)<target){
                  count++;
              }
          }
      }
      return count;
  }
}