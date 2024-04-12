// Time complexity: O(n)
// Space complexity: O(1)
// Problem link : https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/

class Solution{
public static int removeDuplicates(int[] nums) {
        int j=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]!= nums[i-1]){
                nums[j]=nums[i];
                j++;
            }
        }
        return j;
    }
}