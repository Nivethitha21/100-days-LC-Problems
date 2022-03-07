class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null) return l2;
        if(l2 == null) return l1;
        if(l1.val > l2.val) {
            ListNode temp = l1;
            l1 = l2;
            l2 = temp;
        }

        ListNode res = l1;
        while(l1!= null && l2!= null) {
            ListNode curr = null;
            while(l1 != null && l1.val <= l2.val) {
                curr = l1;
                l1 = l1.next; 
            }
            curr.next = l2;
            ListNode temp =l1;
            l1= l2;
            l2 = temp; 
        }
        return res;
    }
}