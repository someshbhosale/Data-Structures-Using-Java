class Solution
{
    //Function to sort a linked list of 0s, 1s and 2s.
    static Node segregate(Node head)
    {
        // add your code here
        Node temp=head;
        ArrayList<Integer> list=new ArrayList<>();
        while(temp!=null)
        {
            list.add(temp.data);
            temp=temp.next;
        }
        Collections.sort(list);
        temp=head;
        for(int i=0; i<list.size(); i++)
            {
                temp.data=list.get(i);
                temp=temp.next;
            }
            
        return head;
    }
}
