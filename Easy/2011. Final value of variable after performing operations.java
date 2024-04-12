// Time complexity: O(n)
// Space complexity: O(1)
// Problem link: https://leetcode.com/problems/final-value-of-variable-after-performing-operations/description/

class Solution {
  public int finalValueAfterOperations(String[] operations) {
      int result = 0;
      for(int i=0;i<operations.length;i++){
          if(sign(operations[i])){
              result++;
          }
          else result--;
      }
      return result;
  }
  public boolean sign(String s){
      for(int i=0;i<s.length();i++){
          if(s.charAt(i)=='+'){
              return true;
          }
          else if(s.charAt(i)=='-'){
              return false;
          }
      }
      return false;
  }
}