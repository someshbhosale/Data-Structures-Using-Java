class Solution {
    void rearrange(int arr[], int n) {
        // code here
        ArrayList<Integer> pos=new ArrayList<>();
        ArrayList<Integer> neg=new ArrayList<>();
        int[] ans=new int[n];
        for(int i=0; i<n; i++)
        {
            if(arr[i]<0)
            {
                neg.add(arr[i]);
            }
            else
            {
                pos.add(arr[i]);
            }
        }
        
        if(pos.size()> neg.size())
        {
            for(int i=0; i<neg.size(); i++)
            {
                ans[i*2]=pos.get(i);
                ans[i*2+1]=neg.get(i);
            }
            int index=neg.size()*2;
            for(int i=neg.size(); i<pos.size(); i++)
            {
                ans[index++]=pos.get(i);
            }
        }
        else
        {
             for(int i=0; i<pos.size(); i++)
            {
                ans[i*2]=pos.get(i);
                ans[i*2+1]=neg.get(i);
            }
            int index=pos.size()*2;
            for(int i=pos.size(); i<neg.size(); i++)
            {
                ans[index++]=neg.get(i);
            }
        }
        for(int i=0; i<n; i++)
        {
            arr[i]=ans[i];
        }
    }
}