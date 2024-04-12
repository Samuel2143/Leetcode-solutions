// Time complexity: O(n)
// Space complexity: O(1)
// Problem link: https://leetcode.com/problems/defanging-an-ip-address/description/

class Solution {
  public String defangIPaddr(String address) {
      StringBuilder res = new StringBuilder();
      for(int i=0;i<address.length();i++){
          if(address.charAt(i)=='.'){
              res.append("[.]");
          }
          else res.append(address.charAt(i));
      }
      return res.toString();
  }
}