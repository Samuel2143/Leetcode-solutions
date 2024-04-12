// Time complexity: O(log n)
// Space complexity: O(1)
// Problem link: https://leetcode.com/problems/search-insert-position/description/

class Solution {
    public int searchInsert(int[] nums, int target) {
        int start = 0,mid;
        int end = nums.length-1;
        while(start<=end){
            mid = (start+end)/2;
            if(target<nums[mid])
                end = mid-1;
            else if(target>nums[mid])
                start = mid+1;
            else
                return mid;
        }
        return start;
    }
}