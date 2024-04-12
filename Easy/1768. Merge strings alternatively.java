// Time complexity: O(n+m)
// Space complexity: O(1)
// Problem link: https://leetcode.com/problems/merge-strings-alternately/description/

class Solution {
  public String mergeAlternately(String word1, String word2) {
      StringBuilder result = new StringBuilder();
      int p1=0;
      while(p1<word1.length() && p1<word2.length()){
          result.append(word1.charAt(p1));
          result.append(word2.charAt(p1));
          p1++;
      }
      while(p1<word1.length()){
          result.append(word1.charAt(p1));
          p1++;
      }
      while(p1<word2.length()){
          result.append(word2.charAt(p1));
          p1++;
      }
      return result.toString();
  }
}