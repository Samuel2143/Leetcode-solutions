// Time complexity: O(n logn)
// Space complexity: O(1)
// Problem link: https://leetcode.com/problems/count-negative-numbers-in-a-sorted-matrix/description/

class Solution {
  public int countNegatives(int[][] grid) {
      int sum = 0;
      for(int i=0;i<grid.length;i++){
          sum = sum+count(grid[i]);
      }
      return sum;
  }
  public int count(int[] arr){
      int start = 0,end = arr.length-1,mid;
      if(arr[end]>=0) return 0;
      while(start<end){
          mid = (start+end)/2;
          if(arr[mid]<0){
              end = mid;
          }
          else start = mid+1;
      }
      return arr.length-start;
  }
}