// Time complexity: O(nlogn)
// Space complexity: O(1)
// Problem link: https://leetcode.com/problems/split-array-largest-sum/description/

class Solution {
  public int splitArray(int[] arr, int k) {
      if(k>arr.length) return -1;
      int end = maximum(arr);
      int start = minimum(arr);
      if(k==1) return end;
      else if (k==arr.length) return start;
      else{
          int count,mid,sum;
          while(start<end){
              count=1;
              mid = (start + end)/2;
              sum=0;
              for(int i=0;i<arr.length;i++) {
                  sum = sum + arr[i];
                  if (sum > mid) {
                      sum=0;
                      i--;
                      count++;
                  }
              }
              if(count>k) start = mid+1;
              else end = mid;
          }
      }
      return start;
  }
  public static int maximum(int[] arr){
      int carry=0,sum,max = Integer.MIN_VALUE;
      for(int i=0;i<arr.length;i++){
          sum = carry + arr[i];
          if(sum>max) max = sum;
          if(sum>0) carry = sum;
          else carry = 0;

      }
      return max;
  }
  public static int minimum(int[] arr){
      int max = Integer.MIN_VALUE;
      for(int i=0;i<arr.length;i++){
          if(arr[i]>max) max = arr[i];
      }
      return max;
  }
}