// Time complexity: O(n)
// Space complexity: O(n)
// Problem link: https://leetcode.com/problems/number-of-students-unable-to-eat-lunch/description/

class Solution {
  public int countStudents(int[] students, int[] sandwiches) {
      ArrayList<Integer> arr = new ArrayList<>();
      for (int value : students) {
          arr.add(value);
      }
      int index=0,start=0,count=0;
      while(index<sandwiches.length){
          if(sandwiches[index]==arr.get(start)){
              arr.remove(start);
              count++;
              start=0;
              index++;
          }
          else start++;
          if(start==arr.size()){
              return students.length-count;
          }
      }
      return 0;
  }
}