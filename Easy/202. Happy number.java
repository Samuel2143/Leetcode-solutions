// Time complexity: O(log n)
// Space complexity: O(1)
// Problem link: https://leetcode.com/problems/happy-number/description/

class Solution {
  public boolean isHappy(int n) {
      while(n!=4 && n!=1){
          n = happyNumber(n);
      }
      return n==1;
  }
  public int happyNumber(int n){
      int sum=0;
      while(n>0){
          int ld = n%10;
          sum = sum + ld*ld;
          n = n/10;
      }
      return sum;
  }
}
