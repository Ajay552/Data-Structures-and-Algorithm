// https://leetcode.com/problems/palindrome-linked-list/
public class Palindrome_LL {
// cant run

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
    public boolean isPalindrome(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        ListNode p = null; // previous
        ListNode curr = null;    
        ListNode n = null;
        if(fast == null){  // even number of nodes
            curr = slow;
            // n = curr.next;
        } else{
            slow = slow.next;
            curr = slow;
            // n = curr.next;
        }
          while(curr != null){
                n = curr.next;
                curr.next = p;
                p = curr;
                curr = n;
            }
        while(p != null){
            System.out.println(p.val);
            if(p.val != head.val){
                return false;
            }
            p = p.next;
            head = head.next;
        }
        return true;
    }
}
