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
    public void reorderList(ListNode head) {
        List<Integer> ls = new ArrayList<Integer>();
        ListNode temp = head;
        while(temp != null)
        {
            ls.add(temp.val);
            temp = temp.next;
        }
        temp = head;
        int i = 0, j = ls.size()-1;
        while(i < j)
        {   
            temp.val = ls.get(i);
            temp = temp.next;
            temp.val = ls.get(j);
            temp = temp.next;
            i++;
            j--;
        }
        if(ls.size() % 2 != 0)
        {
            temp.val = ls.get(i);
        }
    }
}
// 1 2 3 4 5
// 1 5 2 4 3

    