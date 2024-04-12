// Time complexity: O(n)
// Space complexity: O(1)
// Problem link: https://leetcode.com/problems/remove-element/description/

class Solution {
    public static int removeElement(int[] nums, int val) {
        int j=0,i=0;
        while(i<nums.length){
            if(nums[i]!=val){
                nums[j]=nums[i];
                j++;
            }
            i++;
        }
        return j;
    }
}