class Solution {
    int print2largest(int arr[], int n) {
        
        int max=Integer.MIN_VALUE;
        for(int i=0; i<n; i++)
        {
            if(arr[i]>max)
            max=arr[i];
        }
        
        int secmax=-1;
        for(int i=0; i<n; i++)
        {
            if(arr[i]>secmax && arr[i]<max)
                secmax=arr[i];
        }
        return secmax;
        
        
    }
}