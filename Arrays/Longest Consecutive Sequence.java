class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for(int i=0; i<nums.length; i++)
        {
            set.add(nums[i]);

        }
        int longeststreak=0;
        for(int i=0; i<nums.length; i++)
        {
            if(!set.contains(nums[i]-1))
            {
                int cur=nums[i];
                int curstreak=1;
                while(set.contains(cur+1))
                {
                    cur=cur+1;
                    curstreak+=1;
                }
                longeststreak=Math.max(curstreak,longeststreak);
            }
        }
        return longeststreak;
        
    }
}