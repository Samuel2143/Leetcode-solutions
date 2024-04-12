// Time complexity: O(n)
// Space complexity: O(n)
// Problem link: https://leetcode.com/problems/make-the-string-great/description/

class Solution {
    public String makeGood(String s) {
        StringBuilder result = new StringBuilder(s);
        for(int i=0;i<result.length()-1;i++){
            if(Math.abs(result.charAt(i)-result.charAt(i+1))==32){
                result = result.delete(i,i+2);
                i=-1;
            }
        }
        return result.toString();
    }
}