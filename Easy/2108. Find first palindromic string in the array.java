// Time complexity: O(n*m)
// Space complexity: O(1)
// Problem link: https://leetcode.com/problems/find-first-palindromic-string-in-the-array/description/

class Solution {
  public String firstPalindrome(String[] words) {
      int i;
      for(i=0;i<words.length;i++){
          if(isPalindrome(words[i])){
              return words[i];
          }
      }
      return "";
  }
  public boolean isPalindrome(String str){
      int start = 0,end = str.length()-1;
      while(start<end){
          if(str.charAt(start)!=str.charAt(end)){
              return false;
          }
          start++;
          end--;
      }
      return true;
  }
}