// Time complexity: O(n)
// Space complexity: O(1)
// Problem link: https://leetcode.com/problems/reverse-linked-list/description/

class Solution {
  public ListNode reverseList(ListNode head) {
      ListNode prev = null;
      ListNode current = head;
      ListNode node = null;
      while(current!=null){
          node = current.next;
          current.next = prev;
          prev = current;
          current = node;
      }
      return prev;
  }
}