class pair
{
    Node node;
    int hd;
    pair(int hd,Node node)
    {
        this.hd=hd;
        this.node=node;
    }
}
class Solution
{
    //Function to return a list of nodes visible from the top view 
    //from left to right in Binary Tree.
    static ArrayList<Integer> topView(Node root)
    {
        // add your code
        ArrayList<Integer> ans=new ArrayList<>();
        if(root == null) 
            return ans;
        Map<Integer,Integer> map=new TreeMap<>();
        Queue<pair> q=new LinkedList<>();
        q.add(new pair(0,root));
        while(!q.isEmpty())
        {
            pair it=q.remove();
            int hd=it.hd;
            Node temp=it.node;
            
            if(map.get(hd)==null)
            {
                map.put(hd,temp.data);
            }
            if(temp.left!=null)
            {
                q.add(new pair(hd-1,temp.left));
            }
            if(temp.right!=null)
            {
                q.add(new pair(hd+1,temp.right));
            }
        }
         for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            ans.add(entry.getValue());
        }
        return ans;
        
        
    }
}