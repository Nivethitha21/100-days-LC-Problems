class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null)
            return head;
        ListNode rem = head.next.next;
        ListNode head2 = head.next;
        head2.next = head;
        head.next = swapPairs(rem);
        return head2;
    }
}