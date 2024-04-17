// Time complexity: O(n*m)
// Space complexity: O(1)
// Problem link: https://leetcode.com/problems/find-the-sum-of-encrypted-integers/description/

class Solution {
  public int sumOfEncryptedInt(int[] nums) {
      int i,sum=0;
      for(i=0;i<nums.length;i++){
          sum = sum + encrypt(nums[i]);
      }
      return sum;
  }
  public int encrypt(int num){
      int count = 0,n=num,max=Integer.MIN_VALUE,val,i=0,sum=0;
      while(n>0){
          val=n%10;
          max = Math.max(val,max);
          count++;
          n=n/10;
      }
      if(count<=1) return num;
      while(i<count){
          sum = sum*10 + max;
          i++;
      }
      return sum;
  }
}