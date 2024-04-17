// Time complexity: O(n)
// Space complexity: O(1)
// Problem link: https://leetcode.com/problems/trapping-rain-water/description/

class Solution {
  public int trap(int[] height) {
      int start=0,left=height[start],water=0,end=height.length-1,right=height[end];
      while (start<end)
      {
          if(left<=right)
          {
              water+=(left-height[start]);
              start++;
              left=Math.max(left,height[start]);
          }
          else 
          {
              water+=(right-height[end]);
              end--;
              right=Math.max(right,height[end]);
          }
      }
      return water;
  }
}