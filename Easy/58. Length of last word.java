// Time complexity: O(n)
// Space complexity: O(1)
// Problem link: https://leetcode.com/problems/length-of-last-word/description/

class Solution {
  public int lengthOfLastWord(String s) {
      int length=0;
      boolean alp = false;
      for(int i=s.length()-1;i>=0;i--){
          if(alp && s.charAt(i)==' ') break;
          else if(s.charAt(i)==' ') continue;
          if(s.charAt(i)!=' ') alp = true;
          length++;
      }
      return length;
  }
}
