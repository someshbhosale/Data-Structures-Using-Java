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
        int n=0;
        ListNode cur=head;
        if(head==null || head.next==null)
            return null;


        while(cur!=null)
        {
            cur=cur.next;
            n++;
        }
        
        int del=n/2;
        ListNode prev=head;
        int i=1;
        while(i < del)
        {
            prev=prev.next;
            i++;
        }
        prev.next=prev.next.next;
        return head;
        
    }
}