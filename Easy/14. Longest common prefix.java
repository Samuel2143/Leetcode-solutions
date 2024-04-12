// Time complexity: O(n*m*log(n))
// Space complexity: O(n*m)
// Problem link: https://leetcode.com/problems/longest-common-prefix/description/

class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String first = strs[0];
        String last = strs[strs.length-1];
        int index = 0;
        while(index<first.length()&&index<last.length()){
            if(first.charAt(index)==last.charAt(index)){
                index++;
            }
            else break;
        }
        return first.substring(0,index);
    }
}
