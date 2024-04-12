// Time complexity: O(n)
// Space complexity: O(1)
// Problem link: https://leetcode.com/problems/linked-list-cycle/description/

public class Solution {
  public boolean hasCycle(ListNode head) {
      ListNode fast = head;
      ListNode slow = head;
      while(fast!=null && fast.next!=null){
          slow = slow.next;
          fast = fast.next.next;
          if(fast==slow) return true;
      }
      return false;
  }
}
