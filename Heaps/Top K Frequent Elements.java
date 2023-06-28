class Solution {
    class pair
    {
        int val;
        int count;
        pair(int val,int count)
        {
            this.val=val;
            this.count=count;
        }
    }
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map= new HashMap<>();
        int[] ans=new int[k];
        
        for(int i=0; i<nums.length; i++)
        {
            if(map.containsKey(nums[i]))
            {
                map.put(nums[i],map.get(nums[i])+1);
            }
            else
            {
                map.put(nums[i],1);
            }
        }
        int x=0;
        PriorityQueue<pair> pq=new PriorityQueue<>((a,b)->(b.count-a.count));
        for(int key: map.keySet())
        {
           pq.add(new pair(key,map.get(key))); 
        }

        while(x!=k)
        {
            ans[x++]=pq.peek().val;
            pq.remove();
        }
        return ans;
        
        
    }
}