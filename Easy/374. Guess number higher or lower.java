// Time complexity: O(log n)
// Space complexity: O(1)
// Problem link: https://leetcode.com/problems/guess-number-higher-or-lower/description/

public class Solution extends GuessGame {
  public int guessNumber(int n) {
      int start = 1,end = n,mid;
      while(start<=end){
          mid = start + (end - start)/2;
          if(guess(mid)==-1) end = mid-1;
          else if(guess(mid)==1) start = mid+1;
          else return mid;
      }
      return -1;
  }
}