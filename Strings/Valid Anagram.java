class Solution {
    public static String sortstring(String s)
    {
        char[] c=s.toCharArray();
        Arrays.sort(c);
        return new String(c);
    }

    public boolean isAnagram(String s, String t) {
        if(s.length()!= t.length())
            return false;

        s=sortstring(s);
        t=sortstring(t);

        for(int i=0; i<s.length(); i++)
        {
            if(s.charAt(i)!= t.charAt(i))
                return false;
        } 
        return true;   
    }
}