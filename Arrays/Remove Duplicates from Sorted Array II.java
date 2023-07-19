class Solution {
    public int removeDuplicates(int[] nums) {
        int lu=0;
        for(int cur=1; cur<nums.length; cur++)
        {
            if(nums[lu]==nums[cur])
            {
                if(lu-1<0 || nums[lu-1]!=nums[cur])
                {
                    nums[lu+1]=nums[cur];
                    lu++;
                }
            }
            else
            {
                nums[lu+1]=nums[cur];
                lu++;
            }
        }
        return lu+1;
        
    }
}