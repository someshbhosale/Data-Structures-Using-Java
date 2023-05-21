class Solution {
    public boolean isValid(String s) {
        Stack<Character> st=new Stack<>();
        for(int i=0; i<s.length(); i++)
        {
            if(s.charAt(i)=='(' || s.charAt(i)=='[' || s.charAt(i)=='{')
            {
                st.push(s.charAt(i));
            }
            else
            {
                if(st.empty()) return false;
                char c=st.pop();
                if(s.charAt(i)==')' && c=='(' || s.charAt(i)=='}' && c=='{' || s.charAt(i)==']' && c=='[')
                continue;
                else
                {
                    return false;
                }
            }
        }
        return st.empty();
    }
}