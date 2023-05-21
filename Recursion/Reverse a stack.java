class Solution
{ 
    static void reverse(Stack<Integer> s)
    {
        ArrayList<Integer> list=new ArrayList<>();
        while(!s.empty())
        {
            list.add(s.pop());
        }
        for(int i=0; i<list.size(); i++)
        {
            s.push(list.get(i));
        }
    }
}