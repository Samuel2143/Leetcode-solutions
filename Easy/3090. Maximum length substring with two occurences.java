// Time complexity: O(n^4)
// Space complexity: O(1)
// Problem link: https://leetcode.com/problems/maximum-length-substring-with-two-occurrences/description/

class Solution {
  public int maximumLengthSubstring(String s) {
      int i,j,ans=0;
      String str;
      for(i=0;i<s.length();i++){
          for(j=i+1;j<s.length();j++){
              str = s.substring(i,j+1);
              if(check(str)){
                  ans = Math.max(ans,j-i+1);
              }
          }
      }
      return ans;
  }
  public boolean check(String s){
      int i,j,count;
      for(i=0;i<s.length();i++){
          count=1;
          for(j=i+1;j<s.length();j++){
              if(s.charAt(i)==s.charAt(j)) count++;
              if(count>2) return false;
          }
      }
      return true;
  }
}