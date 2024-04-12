// Time complexity: O(n)
// Space complexity: O(1)
// Problem link: https://leetcode.com/problems/is-subsequence/description/

class Solution {
  public boolean isSubsequence(String s, String t) {
      if(s.length()<1) return true;
      if(t.length()<1) return false;
      int index=0,i;
      for(i=0;i<t.length();i++){
          if(s.charAt(index)==t.charAt(i)){
              index++;
          }
          if(index==s.length()) return true;
      }
      return false;
  }
}