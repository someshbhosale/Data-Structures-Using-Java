class Solution{
    //Function to find the leaders in the array.
    static ArrayList<Integer> leaders(int arr[], int n){
        // Your code here
        ArrayList<Integer> list=new ArrayList<>();
        int max=arr[n-1];
        list.add(max);
        for(int i=n-2; i>=0; i--)
        {
            if(max<=arr[i])
            {
                max=arr[i];
                list.add(arr[i]);
            }
            
        }
        Collections.reverse(list);
        return list;
    }
    
}