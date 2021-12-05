public class LL_cycle {
//  cannot run this directly
    // https://leetcode.com/problems/linked-list-cycle-ii/
   
    /**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
    
        ListNode fast = head;
        ListNode slow = head;
        
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow) break;
        }
        
        if(fast == null || fast.next ==null) return null;
        
        ListNode p1 = head;

        while(p1 != slow){
            p1 = p1.next;
            slow = slow.next;
        }
        
        return p1;
    }
}
}
