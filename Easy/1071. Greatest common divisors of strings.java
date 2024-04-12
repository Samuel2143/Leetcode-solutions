// Time complexity: O(log(min(a,b)))
// Space complexity: O(1)
// Problem link: https://leetcode.com/problems/greatest-common-divisor-of-strings/description/

class Solution {
  public String gcdOfStrings(String str1, String str2) {
      if (!(str1 + str2).equals(str2 + str1))
          return "";
      int result = gcd(str1.length(), str2.length());
      return str1.substring(0, result);
  }

  private int gcd(int a, int b) {
      return b == 0 ? a : gcd(b, a % b);
  }
}