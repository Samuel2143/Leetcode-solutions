// Time complexity: O(1)
// Space complexity: O(1)
// Problem link: https://leetcode.com/problems/latest-time-you-can-obtain-after-replacing-characters/description/

class Solution {
  public String findLatestTime(String s) {
      StringBuilder result = new StringBuilder();
      if(s.charAt(0)=='?' && (s.charAt(1)=='0' || s.charAt(1)=='?' || s.charAt(1)=='1')) result.append("1");
      else if(s.charAt(0)=='?') result.append("0");
      else result.append(s.charAt(0));

      if(s.charAt(1)=='?' && result.charAt(0)=='1') result.append("1");
      else if(s.charAt(1)=='?' && result.charAt(0)=='0') result.append("9");
      else result.append(s.charAt(1));

      result.append(":");

      if(s.charAt(3)=='?') result.append("5");
      else result.append(s.charAt(3));

      if(s.charAt(4)=='?') result.append("9");
      else result.append(s.charAt(4));

      return result.toString();
  }
}