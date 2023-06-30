class Solution {
    void recper(int index,int[] nums, List<List<Integer>> ans)
    {
        if(index==nums.length)
        {
            ArrayList<Integer> ds=new ArrayList<>();
            for(int i=0; i<nums.length; i++)
            {
                ds.add(nums[i]);

            }
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i=index; i<nums.length; i++)
        {
            swap(index,i,nums);
            recper(index+1,nums,ans);
            swap(index,i,nums);
        }
    }

    void swap(int i,int j, int[] nums)
    {
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        recper(0,nums,ans);
        return ans;
    }
}