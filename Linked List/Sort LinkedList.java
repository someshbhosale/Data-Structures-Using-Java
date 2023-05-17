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
    public ListNode sortList(ListNode head) {
        ListNode temp=head;
        ArrayList<Integer> arr=new ArrayList<>();

        while(temp!=null)
        {
            arr.add(temp.val);
            temp=temp.next;
        }

        temp=head;
        int index=0;
        Collections.sort(arr);

        while(temp!=null)
        {
            temp.val=arr.get(index++);
            temp=temp.next;
        }
        return head;

        
      
    }
}