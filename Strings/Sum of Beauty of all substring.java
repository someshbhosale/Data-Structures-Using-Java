class Solution {
    public static int findbeauty(int[] s)
    {
        int max=-1;
        int min=Integer.MAX_VALUE;
        for(int i=0; i<s.length; i++)
        {
            max=Math.max(max,s[i]);
            if(s[i]>=1)
            {
                min=Math.min(min,s[i]);
            }
        }
        return max-min;

    }
    public int beautySum(String s) {
        int beauty=0;
        int[] cnt=new int[26];
        for(int i=0; i<s.length(); i++)
        {
            Arrays.fill(cnt,0);
            for(int j=i; j<s.length(); j++)
            {
                cnt[s.charAt(j)-'a']++;
                beauty+=findbeauty(cnt);
            }
        }
        return beauty;
    }
}