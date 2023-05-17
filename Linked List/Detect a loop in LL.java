public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        if(head==null)
            return false;
        while(fast!=null && fast.next!=null)
        {
            fast=fast.next.next;
            slow=slow.next;

            if(fast==slow)
                return true;
        }
        return false;
        
    }
}

/*
 public class Solution {
    public boolean hasCycle(ListNode head) {
        HashSet<ListNode> set=new HashSet<>();
        ListNode temp=head;
        while(temp!=null)
        {
            if(set.contains(temp))
            {
                return true;
            }
            else
            {
                set.add(temp);
            }
            temp=temp.next;
        }
        return false;
    }
}
 */