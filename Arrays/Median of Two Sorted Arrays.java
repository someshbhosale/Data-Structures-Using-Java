class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] array=new int[nums1.length+nums2.length];
        int k=0;
        for(int i=0; i<nums1.length; i++)
        {
            array[k++]=nums1[i];
        }
        
        for(int i=0; i<nums2.length; i++)
        {
            array[k++]=nums2[i];
        }
        Arrays.sort(array);

        if(array.length %2 == 0)
        {
            int mid1=array[array.length/2];
            int mid2=array[(array.length/2)-1];
            return (double)(mid1+mid2)/2;
        }
        else
        {
            return (double)(array[array.length/2]);
        }
    }
}