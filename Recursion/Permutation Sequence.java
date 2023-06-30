//Brute Force
class Solution {
    void help(int index,int[] num,int n,int k,List<String> ans)
    {
        if(index==num.length)
        {
            StringBuffer store=new StringBuffer();
            for(int i=0; i<n; i++)
            {
                store.append(num[i]);
            }
            ans.add(store.toString());
            return;
        }
        for(int i=index; i<n; i++)
        {
            swap(i,index,num);
            help(index+1,num,n,k,ans);
            swap(i,index,num);
        }
    }

    void swap(int i,int j,int[] num)
    {
        int temp=num[i];
        num[i]=num[j];
        num[j]=temp;
    }
    public String getPermutation(int n, int k) {
        int num[] = new int[n];
        for(int i=0; i<n; i++)
        {
            num[i]=i+1;
        }
        List<String> ans=new ArrayList<>();
        help(0,num,n,k,ans);
        Collections.sort(ans);
        return ans.get(k-1);
    }
}
// Optimal
class Solution {
         public String getPermutation(int n, int k) {
        int fact=1;
        ArrayList<Integer> num=new ArrayList<>();
        for(int i=1; i<n; i++)
        {
            fact=fact*i;
            num.add(i);
        }
        num.add(n);
        String ans="";
        k=k-1;
        while(true)
        {
            ans=ans+num.get(k/fact);
            num.remove(k/fact);
            if(num.size()==0)
                break;

            k=k%fact;
            fact=fact/num.size();    
        }
        return ans;
    }
}