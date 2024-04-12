// Time complexity: O(n)
// Space complexity: O(1)
// Problem link: https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/description/

class Solution {
  public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
      ArrayList<Boolean> arr = new ArrayList<>();
      int max = candies[0],i,candy;
      for(i=1;i<candies.length;i++){
          max = Math.max(candies[i],max);
      }
      for(i=0;i<candies.length;i++){
          candy = candies[i]+extraCandies;
          if(candy>=max){
              arr.add(true);
          }
          else arr.add(false);
      }
      return arr;
  }
}