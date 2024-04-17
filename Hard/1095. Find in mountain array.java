// Time complexity: O(log n)
// Space complexity: O(1)
// Problem link: https://leetcode.com/problems/find-in-mountain-array/description/ 

class Solution {
  public int findInMountainArray(int target, MountainArray mountainArr) {
      int peak = peakElement(mountainArr);
      int left = ascending(mountainArr,0,peak,target);
      if(left==-1){
          int right = descending(mountainArr,peak,mountainArr.length()-1,target);
          return right;
      }
      return left;
  }
  public int peakElement(MountainArray arr){
      int start=0,end=arr.length()-1,mid;
      while(start<end){
          mid = (start+end)/2;
          if(arr.get(mid)>arr.get(mid+1)) end = mid;
          else if(arr.get(mid)<arr.get(mid+1)) start = mid+1;
      }
      return start;
  }
  public int ascending(MountainArray arr,int s,int e,int target){
      int m;
      while(s<=e){
          m = (s+e)/2;
          if(target>arr.get(m)) s = m + 1;
          else if(target<arr.get(m)) e = m-1;
          else return m;
      }
      return -1;
  }
  public static int descending(MountainArray arr,int s,int e,int target){
      int m;
      while(s<=e){
          m = (s+e)/2;
          if(target<arr.get(m)) s = m + 1;
          else if(target>arr.get(m)) e = m-1;
          else return m;
      }
      return -1;
  }
}