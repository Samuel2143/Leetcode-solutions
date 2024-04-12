// Time complexity: O(n)
// Space complexity: O(1)
// Problem link: https://leetcode.com/problems/valid-palindrome/description/

class Solution {
  public static boolean isPalindrome(String s) {
       int start = 0;
       int end = s.length()-1;
       while (start<=end){
           char schar = s.charAt(start);
           char lchar = s.charAt(end);
           if(!Character.isLetterOrDigit(schar))
               start++;
           else if(!Character.isLetterOrDigit(lchar))
               end--;
           else {
               if(Character.toLowerCase(schar) != Character.toLowerCase(lchar))
                   return false;
               start++;
               end--;
           }
       }
       return true;
   }    
}
