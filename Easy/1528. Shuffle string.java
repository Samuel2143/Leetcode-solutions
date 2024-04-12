// Time complexity: O(n)
// Space complexity: O(n)
// Problem link: https://leetcode.com/problems/shuffle-string/description/

class Solution {
  public String restoreString(String s, int[] indices) {
      char[] result = new char[indices.length];
      int i;
      for(i=0;i<indices.length;i++){
          result[indices[i]]=s.charAt(i);
      }
      return new String(result);
  }
}