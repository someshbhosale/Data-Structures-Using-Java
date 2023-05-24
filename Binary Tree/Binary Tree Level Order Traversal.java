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
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        List<List<Integer>> ans=new LinkedList<>();
        if(root == null)
            return ans;
        q.add(root);
        while(!q.isEmpty())
        {
            int levelsize=q.size();
            List<Integer> sublist=new LinkedList<>();
            for(int i=0; i<levelsize; i++)
            {
                if(q.peek().left!=null) q.add(q.peek().left);
                if(q.peek().right!=null) q.add(q.peek().right);
                sublist.add(q.remove().val);
            }
            ans.add(sublist);
        }    
        return ans;
    }
}