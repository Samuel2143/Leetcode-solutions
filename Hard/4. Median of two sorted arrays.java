// Time complexity: O(n+m)
// Space complexity: O(n+m)
// Problem link: https://leetcode.com/problems/median-of-two-sorted-arrays/description/

class Solution {
  public double findMedianSortedArrays(int[] nums1, int[] nums2) {
      int[] merged = new int[nums1.length+nums2.length];
      int i=0,j=0,index=0;
      while(index<merged.length){
          if(i==nums1.length){
              merged[index]=nums2[j];
              j++;
          }
          else if(j==nums2.length){
              merged[index]=nums1[i];
              i++;
          }
          else if(nums1[i]<nums2[j]){
              merged[index]=nums1[i];
              i++;
          }
          else{
              merged[index]=nums2[j];
              j++;
          }
          index++;
      }
      if(merged.length%2==0){
          return (merged[(merged.length-1)/2]+merged[((merged.length-1)/2)+1])/2.0;
      }
      return merged[(merged.length-1)/2];
  }
}