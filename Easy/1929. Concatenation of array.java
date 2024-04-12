// Time complexity: O(n)
// Space complexity; O(1)
// Problem link: https://leetcode.com/problems/concatenation-of-array/description/

class Solution {
  public int[] getConcatenation(int[] nums) {
      int[] result = new int[nums.length*2];
      int index=0;
      for(int i=0;i<result.length;i++){
          result[i]=nums[index];
          index++;
          if(index==nums.length) index=0;
      }
      return result;
  }
}