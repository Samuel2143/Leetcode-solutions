// Time complexity: O(n)
// Space complexity: O(n)
// Problem link: https://leetcode.com/problems/distribute-elements-into-two-arrays-i/description/

class Solution {
  public int[] resultArray(int[] nums) {
      int[] arr1 = new int[nums.length];
      int[] arr2 = new int[nums.length];
      int i,index1=1,index2=1;
      arr1[0]=nums[0];
      arr2[0]=nums[1];
      for(i=2;i<nums.length;i++){
          if(arr1[index1-1]>arr2[index2-1]){
              arr1[index1]=nums[i];
              index1++;
          }
          else{
              arr2[index2]=nums[i];
              index2++;
          }
      }
      int[] result = Arrays.copyOf(arr1, nums.length);
      System.arraycopy(arr2, 0, result, index1, index2);
      return result;
  }
}