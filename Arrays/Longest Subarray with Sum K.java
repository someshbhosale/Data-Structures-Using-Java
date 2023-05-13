class Solution{
    
   
    // Function for finding maximum and value pair
    public static int lenOfLongSubarr (int A[], int N, int K) {
        //Complete the function
        int maxlen=0,sum=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        
        for(int i=0; i<N; i++)
        {
            sum+=A[i];
            if(sum==K)
            {
                maxlen=Math.max(maxlen,i+1);
            }
            
            if(!map.containsKey(sum))
            {
                map.put(sum,i);
            }
            
            if(map.containsKey(sum-K))
            {
                maxlen=Math.max(maxlen,i-map.get(sum-K));
            }
        }
        return maxlen;
    }
    