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
    public ListNode oddEvenList(ListNode head) {
        ListNode temp=head;
        ArrayList<Integer> list=new ArrayList<>();
        while(temp!=null)
        {
            list.add(temp.val);
            temp=temp.next;
        }
         
        temp=head;
        while(temp!=null)
        {
            for(int i=0; i<list.size(); i=i+2)
            {
                temp.val=list.get(i);
                temp=temp.next;
            }
             for(int i=1; i<list.size(); i=i+2)
            {
                temp.val=list.get(i);
                temp=temp.next;
            }
        }
       return head;
    }
}