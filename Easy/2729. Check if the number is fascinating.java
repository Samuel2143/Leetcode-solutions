// Time complexity: O(1)
// Space complexity: O(1)
// Problem link: https://leetcode.com/problems/check-if-the-number-is-fascinating/description/

class Solution {
  public boolean isFascinating(int n) {
      String result = "";
      int i;
      for(i=1;i<=3;i++){
          result = result + n*i;
      }
      if(result.length()>9) return false;
      char[] arr = result.toCharArray();
      Arrays.sort(arr);
      for(i=0;i<9;i++){
          if(arr[i]-48!=i+1) return false;
      }
      return true;
  }
}