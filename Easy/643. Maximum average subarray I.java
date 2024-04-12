// Time complexity: O(n)
// Space complexity: O(1)
// Problem link: https://leetcode.com/problems/maximum-average-subarray-i/description/

class Solution {
  public double findMaxAverage(int[] nums, int k) {
      int sum = 0;
      int i, j;
      for (i = 0; i < k; i++) {
          sum = sum + nums[i];
      }
      int max = sum;
      for (j = i; j < nums.length; j++) {
          sum = sum + (nums[j] - nums[j - k]);
          if (sum > max)
              max = sum;
      }
      return (double) max / k;
  }

}