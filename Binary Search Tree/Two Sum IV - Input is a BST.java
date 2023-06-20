/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public void inorder(TreeNode root,ArrayList<Integer> list)
    {
        if(root==null)
            return;

        inorder(root.left,list);
        list.add(root.val);
        inorder(root.right,list);    
    }
    public boolean findTarget(TreeNode root, int k) {
        ArrayList<Integer> list=new ArrayList<>();
        int sum=0;
        inorder(root,list);
        int i=0,j=list.size()-1;
        while(i<j)
        {
            sum=list.get(i)+list.get(j);
            if(sum==k)
                return true;
            else if(sum>k)
                j--;
            else
                i++;
                
        }
        
        return false;
    }
}