class Solution {
    public int searchInsert(int[] nums, int target) {
        int i;
        for( i=0; i<nums.length; i++)
        {
            if(nums[i]==target)
                return i;
        }
        int count=0;
        for(i=0; i<nums.length; i++)
        {
            if(target>nums[i])
                count++;
        }
       
        return count;
    }
}