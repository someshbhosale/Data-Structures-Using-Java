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
    public TreeNode bstFromPreorder(int[] preorder) {
        TreeNode root=new TreeNode(preorder[0]);
        for(int i=1; i<preorder.length; i++)
        {
            int cur=preorder[i];
            TreeNode dummy=root;
            TreeNode prev=null;
            while(dummy!=null)
            {
                prev=dummy;
                if(cur<dummy.val)
                    dummy=dummy.left;
                else
                    dummy=dummy.right;    
            }
            if(cur<prev.val)
                prev.left=new TreeNode(cur);
            else
                prev.right=new TreeNode(cur);    
        }
        return root;
        
    }
}