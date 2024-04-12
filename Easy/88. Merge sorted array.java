// Time complexity: O(m+n)
// Space complexity: O(1)
// Problem link: https://leetcode.com/problems/merge-sorted-array/description/

class Solution {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int index = m+n-1;
        m--;
        n--;
        while(m>=0 && n>=0){
            if(nums1[m]>=nums2[n]){
                nums1[index]=nums1[m];
                nums1[m]=0;
                m--;
            }
            else{
                nums1[index]=nums2[n];
                n--;
            }
            index--;
        }
        while(n>=0){
            nums1[index]=nums2[n];
            n--;
            index--;
        }
    }
}