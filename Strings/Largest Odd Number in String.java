class Solution {
    public String largestOddNumber(String num) {
        String ans="";
        for(int i=num.length()-1; i>=0; i--)
        {
            char c=num.charAt(i);
            if(c%2!=0)
            {
                ans=num.substring(0,i+1);
                return ans;
            }
            
        }
        return "";
    }
}