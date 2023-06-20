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
 void traverse(TreeNode root,ArrayList<Integer> list )
    {
        if(root==null)
            return;
        traverse(root.left,list);
        list.add(root.val);        
        traverse(root.right,list);    
    }
    public int kthSmallest(TreeNode root, int k) {
        ArrayList<Integer> temp=new ArrayList<>();
        traverse(root,temp);
        return temp.get(k-1);
    }
}