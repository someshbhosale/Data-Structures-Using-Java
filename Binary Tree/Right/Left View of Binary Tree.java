class Solution {
    public void right(TreeNode root,ArrayList<Integer> list,int depth)
    {
        if(root == null)
            return;

        if(list.size()== depth)
            list.add(root.val);
        right(root.right,list,depth+1);
        right(root.left,list,depth+1);    
    }
    public List<Integer> rightSideView(TreeNode root) {
        ArrayList<Integer> list=new ArrayList<>();
        right(root,list,0);
        return list;
    }
}