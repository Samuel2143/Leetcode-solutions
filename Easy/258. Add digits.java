// Time complexity: O(logn)
// Space complexity: O(1)
// Problem link: https://leetcode.com/problems/add-digits/

class Solution {
  public int addDigits(int num){
      while(num>9){
          num = addition(num);
      }
      return num;
  }
  public int addition(int num){
      int sum=0,ld;
      while(num>0){
          ld = num%10;
          sum = sum + ld;
          num/=10;
      }
      return sum;
  }
}
