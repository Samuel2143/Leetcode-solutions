// Time complexity: O(n)
// Space complexity: O(1)
// Problem link: https://leetcode.com/problems/middle-of-the-linked-list/description/

class Solution {
  public ListNode middleNode(ListNode head) {
      ListNode fast = head;
      ListNode slow = head;
      while(fast!=null && fast.next!=null){
          slow = slow.next;
          fast = fast.next.next;       
      }
      return slow;
  }
}