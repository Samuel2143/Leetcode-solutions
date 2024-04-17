// Time complexity: O(n)
// Space complexity: O(1)
// Problem link: https://leetcode.com/problems/find-the-pivot-integer/description/

class Solution {
  public int pivotInteger(int n){
      int[] sum = new int[n];
      int i;
      sum[0]=1;
      for(i=1;i<n;i++){
          sum[i]=sum[i-1]+i+1;
      }
      int left=0,right;
      for(i=0;i<n;i++){
          if(i>0) left = sum[i-1];
          right = sum[n-1]-sum[i];
          if(left==right) return i+1;
      }
      return -1;
  }
}
