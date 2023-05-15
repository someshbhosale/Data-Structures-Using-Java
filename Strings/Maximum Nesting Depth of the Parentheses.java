class Solution {
    public int maxDepth(String s) {
       int ans=0,j=0;
       for(int i=0; i<s.length(); i++)
       {
           if(s.charAt(i)=='(')
           {
               j++;
           }
           if(s.charAt(i)==')')
           {
               j--;
           }
           ans=Math.max(ans,j);
       } 
       return ans;
    }
}