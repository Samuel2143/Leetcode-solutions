// Time complexity: O(n)
// Space complexity: O(1)
// Problem link: https://leetcode.com/problems/palindrome-linked-list/description/

class Solution {
  public boolean isPalindrome(ListNode head) {
      ListNode fast = head;
      ListNode slow = head;
      while(fast!=null && fast.next!=null){
          fast = fast.next.next;
          slow = slow.next;
      }
      ListNode prev = null;
      ListNode current = slow;
      ListNode next = current.next;
      while(current!=null){
          current.next = prev;
          prev = current;
          current = next;
          if(next!=null) next = next.next;
      }
      while(prev!=null){
          if(head.val!=prev.val) return false;
          prev = prev.next;
          head = head.next;
      }
      return true;
  }
}
