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
        int size=0;
        ListNode cur=head;
        if(head==null || head.next== null)
            return null;
        while(cur!=null)
        {
            cur=cur.next;
            size++;
        }
        if(n==size)
        {
            return head.next;
        }

        int del=size-n;
        ListNode prev=head;
        int i=1;
        while(i<del)
        {
            prev=prev.next;
            i++;
        }  
        prev.next=prev.next.next;
        return head;      
    }
}