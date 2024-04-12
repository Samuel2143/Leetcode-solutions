// Time complexity: O(n)
// Space complexity: O(1)
// Problem link: https://leetcode.com/problems/substrings-of-size-three-with-distinct-characters/description/

class Solution {
  public int countGoodSubstrings(String s) {
      int count=0;
      for(int i=0;i<=s.length()-3;i++){
          if(check(s.substring(i,i+3))){
              count++;
          }
      }
      return count;
  }
  public boolean check(String s){
      int i,j;
      for(i=0;i<s.length();i++){
          for(j=i+1;j<s.length();j++){
              if(s.charAt(i)==s.charAt(j)) return false;
          }
      }
      return true;
  }
}