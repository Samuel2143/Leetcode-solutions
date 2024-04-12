// Time complexity: O(n)
// Space complexity: O(1)
// Problem link: https://leetcode.com/problems/can-place-flowers/description/

class Solution {
  public boolean canPlaceFlowers(int[] flowerbed, int n) {
      int i=0;
      for (i = 0; i < flowerbed.length; i++) {
          if (n <= 0)
              return true;
          if (flowerbed[i] == 0) {
              if (i == flowerbed.length - 1 || flowerbed[i + 1] == 0) {
                  n--;
                  i++;
              } else {
                  i += 2;
              }
          } else {
              i++;
          }
      }
      return n <= 0;
  }
}