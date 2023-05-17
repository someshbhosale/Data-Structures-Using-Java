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
    public ListNode reverseList(ListNode head) {
        ListNode temp=null;
        ListNode cur=head;
        ListNode prev=null;

        if(head==null)
            return head;

        while(cur!=null)
        {
            temp=prev;
            prev=cur;
            cur=cur.next;
            prev.next=temp;
        }    
        return prev;
    }
}