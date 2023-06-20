class pair
{
    int hd;
    Node node;
    pair(Node node,int hd)
    {
        this.hd=hd;
        this.node=node;
    }
}

class Solution
{
    //Function to return a list containing the bottom view of the given tree.
    public ArrayList <Integer> bottomView(Node root)
    {
        // Code here
        ArrayList<Integer> ans=new ArrayList<>();
        TreeMap<Integer,Integer> map=new TreeMap<>();
        if(root==null)
            return ans;
        Queue<pair> q=new LinkedList<>(); 
        q.add(new pair(root,0));  
        while(!q.isEmpty())
        {
            pair it=q.remove();
            int hd=it.hd;
            Node temp=it.node;
            map.put(hd,temp.data);
            if(temp.left!=null)
            {
                q.add(new pair(temp.left,hd-1));
            }
            if(temp.right!=null)
            {
                q.add(new pair(temp.right,hd+1));
            }
        }
        for(Integer num:map.values())
        {
            ans.add(num);
        }
        return ans;
    }
}