// Time Complexity: O(log(n))
// Space Complexity: O(1)
// Problem link: https://leetcode.com/problems/palindrome-number/description/

class Solution {
    public boolean isPalindrome(int x) {
      int y = x;
      int sum = 0;
        while(x>0){
          sum = sum*10 + x%10;
          x = x/10;
        }
        if(y==sum) return true;
        else return false;
    }
}