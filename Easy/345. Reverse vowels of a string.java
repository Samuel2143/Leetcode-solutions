// Time complexity: O(n)
// Space complexity: O(n)
// Problem link: https://leetcode.com/problems/reverse-vowels-of-a-string/description/

class Solution {
  public String reverseVowels(String s) {
      char[] word = s.toCharArray();
      String vowels="aeiouAEIOU";
      int start = 0, end = s.length() - 1;
      char temp;
      while(start<end){
          if(vowels.indexOf(word[start])!=-1 && vowels.indexOf(word[end])!=-1){
              temp = word[start];
              word[start]=word[end];
              word[end]=temp;
              start++;
              end--;
          }
          else if(vowels.indexOf(word[start])==-1){
              start++;
          }
          else end--;
      }
      return String.valueOf(word);
  }
}