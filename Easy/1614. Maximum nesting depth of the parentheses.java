// Time complexity: O(n)
// Space complexity: O(1)
// Problem link: https://leetcode.com/problems/maximum-nesting-depth-of-the-parentheses/description/

class Solution {
  public int maxDepth(String s) {
      int count=0,i,result=0;
      for(i=0;i<s.length();i++){
          if(s.charAt(i)=='('){
              count++;
              result = Math.max(result,count);
          }
          else if(s.charAt(i)==')') count--;
      }
      return result;
  }
}