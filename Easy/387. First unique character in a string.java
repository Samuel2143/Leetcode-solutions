// Time complexity: O(n^2)
// Space complexity: O(1)
// Problem link: https://leetcode.com/problems/first-unique-character-in-a-string/description/

class Solution {
  public int firstUniqChar(String s) {
      int flag,i,j;
      for(i=0;i<s.length();i++){
          flag=0;
          for(j=0;j<s.length();j++){
              if(i==j) continue;
              if(s.charAt(i)==s.charAt(j)){
                  flag=1;
                  break;
              }
          }
          if(flag==0) return i;
      }
      return -1;
  }
}