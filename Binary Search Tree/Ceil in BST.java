/*Given a BST and a number X, find Ceil of X.
Note: Ceil(X) is a number that is either equal to X or is immediately greater than X*/

class Tree {
    // Function to return the ceil of given number in BST.
    int findCeil(Node root, int key) {
        if (root == null) return -1;
        // Code here
        int ceil=-1;
        while(root!=null)
        {
            if(root.data==key)
            {
                ceil=root.data;
                return ceil;
            }
            if(key>root.data)
            {
                root=root.right;
            }
            else
            {
                ceil=root.data;
                root=root.left;
                
            }
        }
        return ceil;
    }
}
