// Time complexity: O(mlogm + nlogn + (m + n)*n)
// Space complexity: O(n+m)
// Problem link: https://leetcode.com/problems/intersection-of-two-arrays/description/

class Solution {
  public int[] intersection(int[] nums1, int[] nums2) {
      Arrays.sort(nums1);
      Arrays.sort(nums2);
      ArrayList<Integer> result = new ArrayList<>();
      int p1=0,p2=0;
      while(p1<nums1.length && p2<nums2.length){
          if(nums1[p1]<nums2[p2]){
              p1++;
          }
          else if(nums1[p1]>nums2[p2]){
              p2++;
          }
          else{
              check(result,nums1[p1]);
              p1++;
              p2++;
          }
      }
       int[] res = new int[result.size()];
       int i;
       for( i =0; i<result.size();i++){
           res[i]=result.get(i);
       }
       return res;
  }
  public void check(List<Integer> arr,int num){
      if(arr.size()<0){
          arr.add(num);
      }
      else{
          int i,count=0;
          for(i=0;i<arr.size();i++){
              if(num==arr.get(i)){
                  count++;
              }
          }
          if(count==0) arr.add(num);
      }
  }
}