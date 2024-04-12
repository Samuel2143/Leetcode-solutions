// Time complexity: O(n+m)
// Space complexity: O(1)
// Problem link: https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/description/

class Solution{
    public int strStr(String haystack, String needle) {
        //indexOf is a built-in string function used to find the index of the given string

        return haystack.indexOf(needle);

        //If the string is found it returns the index number, if it is not found it returns -1
    }
}
