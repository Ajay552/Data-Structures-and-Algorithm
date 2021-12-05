https://leetcode.com/problems/remove-nth-node-from-end-of-list/
class Remove_Nth_node{
    /**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummyhead = new ListNode();
        dummyhead.next = head;
        ListNode fast = dummyhead;
        ListNode slow = dummyhead;
        int count = 0;
        while(fast.next != null){
            fast = fast.next;
            if(count >= n) slow = slow.next;
            count++;
         }
        if(slow == dummyhead){
            dummyhead.next = head.next;
                return dummyhead.next;
        }
        slow.next = slow.next.next;
        
        return dummyhead.next;
    }
}
}