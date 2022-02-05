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
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode node = new ListNode();
        ListNode prev = null;
        ListNode head = node;
        while(true)
        {
            boolean flag = false;
            for(int i = 0; i < lists.length; i++)
        {
            if(lists[i] != null){
                flag = true;
                break;
                }
        }
            if(flag)
            {
                 int min = Integer.MAX_VALUE,ind = -1;
            ListNode temp = new ListNode();
            for(int j = 0; j < lists.length; j++)
            {
                if(lists[j] != null && lists[j].val <= min){
                    min = lists[j].val;
                    temp = lists[j];
                    ind = j;
                }
                }
            // System.out.println(min);
             node.val = temp.val;
                ListNode newNode = new ListNode();
                node.next = newNode;
                prev = node;
                node = node.next;
            lists[ind] = temp.next;
            }
        else
            break; 
        }
        if(prev != null)
            prev.next = null;
        else
            return null;
        // prev == null ?:prev.next = null;
        return head;
    }
    
}


    