class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> st=new Stack<>();
        for(int i=0; i<num.length(); i++)
        {
            while(!st.isEmpty() && k>0 && st.peek()>num.charAt(i))
            {
                st.pop();
                k--;
            }
            if(num.charAt(i)!=0)
            {
                st.push(num.charAt(i));
            }
           
        }
        while(k>0)
        {
            st.pop();
            k--;
        }
        StringBuilder str=new StringBuilder();
        while(!st.isEmpty())
        {
            str.append(st.pop());
        }
        str.reverse();
        while(str.length()!=0 && str.charAt(0)=='0')
        {
            str.deleteCharAt(0);
        }
        return str.length() == 0 ? "0" : str.toString();
    }
}