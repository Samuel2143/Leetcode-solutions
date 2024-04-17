// Time complexity: O(log n)
// Space complexity: O(1)
// Problem link: https://leetcode.com/problems/a-number-after-a-double-reversal/

class Solution {
  public boolean isSameAfterReversals(int num) {
      int rev = reverse(num);
      if(reverse(rev)==num) return true;
      return false;
  }
  public int reverse(int num){
      int ld,rev=0;
      while(num>0){
          ld = num%10;
          rev = rev*10 + ld;
          num/=10;
      }
      return rev;
  }
}