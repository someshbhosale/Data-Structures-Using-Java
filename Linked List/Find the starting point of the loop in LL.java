public class Solution {
    public ListNode detectCycle(ListNode head) {
        HashSet<ListNode> set=new HashSet<>();
        ListNode temp=head;
        while(temp!=null)
        {
            if(set.contains(temp))
                return temp;

            set.add(temp);
            temp=temp.next;    
        }
        return null;
    }
}