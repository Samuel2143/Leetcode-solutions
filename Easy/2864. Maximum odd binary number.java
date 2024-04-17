// Time complexity: O(n)
// Space complexity: O(1)
// Problem link: https://leetcode.com/problems/maximum-odd-binary-number/description/

class Solution {
  public String maximumOddBinaryNumber(String s) {
      int one = 0,i;
      for(i=0;i<s.length();i++){
          if(s.charAt(i)=='1') one++;
      }
      StringBuilder result = new StringBuilder();
      int zero = s.length()-one,index=0;
      while(index<s.length()){
          if(one>1){
              result.append('1');
              one--;
          }
          else if(index==s.length()-1){
              result.append('1');
              one--;
          }
          else{
              result.append('0');
              zero--;
          }
          index++;
      }
      return result.toString();
  }
}