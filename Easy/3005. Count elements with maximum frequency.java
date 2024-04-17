// Time complexity: O(n^2)
// Space complexity: O(1)
// Problem link: https://leetcode.com/problems/count-elements-with-maximum-frequency/description/

class Solution {
  public int maxFrequencyElements(int[] nums) {
      int i,j,count,frequency=1,total=0;
      for(i=0;i<nums.length;i++){
          count=1;
          for(j=i+1;j<nums.length;j++){
              if(nums[i]==nums[j]) {
                  count++;
              }
          }
          if(count==frequency) total = total + frequency;
          else if(count>frequency) total = count;
          frequency = Math.max(count,frequency);

      }
      if(frequency==1) return nums.length;
      return total;
  }
}