class Tree{
    public static void inorder(Node root,ArrayList<ArrayList<Integer>> ans,ArrayList<Integer> path)
    {
        if(root==null)
        {
            return;
        }
        if(root.left==null && root.right==null)
        {
            path.add(root.data);
            ans.add(new ArrayList<>(path));
            path.remove(path.size()-1);
        }
        path.add(root.data);
        inorder(root.left,ans,path);
        inorder(root.right,ans,path);
        path.remove(path.size()-1);
    }
    public ArrayList<ArrayList<Integer>> Paths(Node root){
        // Code here
        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
        inorder(root,ans,new ArrayList<>());
        return ans;
        
    }
    
}