class Solution{
    public static void findsubsetsum(int index,ArrayList<Integer> arr,List<Integer> ans, int sum)
    {
        if(index==arr.size())
        {
            ans.add(sum);
            return;
        }
        //pick
        findsubsetsum(index+1,arr,ans,sum+arr.get(index));
        //not pick
        findsubsetsum(index+1,arr,ans,sum);
    }
    ArrayList<Integer> subsetSums(ArrayList<Integer> arr, int N){
        // code here
        ArrayList<Integer> ans=new ArrayList<>();
        findsubsetsum(0,arr,ans,0);
        Collections.sort(ans);
        return ans;
    }
}