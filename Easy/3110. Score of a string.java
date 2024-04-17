// Time complexity: O(n)
// Space complexity: O(1)
// Problem link: https://leetcode.com/problems/score-of-a-string/description/

class Solution {
  public int scoreOfString(String s) {
      int score=0;
      for(int i=1;i<s.length();i++){
          score += Math.abs(s.charAt(i-1)-s.charAt(i));
      }
      return score;
  }
}