class Solution
{
    //Function to find the length of a loop in the linked list.
    static int countNodesinLoop(Node head)
    {
        HashSet<Node> set=new HashSet<>();
        Node temp=head;
        while(temp!=null && !set.contains(temp))
        {
            set.add(temp);
            temp=temp.next;
        }
        if(temp==null)
            return 0;
        Node start=temp;
        int count=1;
        while(true)
        {
            temp=temp.next;
            if(temp==start)
            {
                return count;
            }
            else
                count++;
        }
    }
}