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
    public ListNode deleteMiddle(ListNode head) {
        if(head.next == null)
            return null;
        if(head.next.next == null)
        {
            head.next = null;
            return head;
        }
        ListNode prev = null;
        ListNode slowPtr = head;
        ListNode fastPtr = head;
        while(fastPtr.next != null && fastPtr.next.next != null)
        {
            prev = slowPtr;
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
        }
        // System.out.println(slowPtr.val+" "+count);
        
        if(fastPtr.next != null)
            slowPtr.next = slowPtr.next.next;
        else
            prev.next = slowPtr.next;
        return head;
    }
}