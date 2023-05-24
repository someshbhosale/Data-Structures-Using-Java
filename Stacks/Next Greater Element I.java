/* Brute Force Approach 
TC: O(n2)
class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] ans=new int[nums1.length];
        int k=0;
        boolean flag=false;
        for(int i=0; i<nums1.length; i++)
        {
            for(int j=0; j<nums2.length; j++)
            {
                if(nums1[i]==nums2[j])
                {
                    int temp=j+1;
                    flag=false;
                    while(temp<nums2.length)
                    {
                        if(nums2[temp]>nums2[j])
                        {
                            flag=true;
                            ans[k++]=nums2[temp];
                            break;
                        }
                        temp++;

                    }
                    if(!flag)
                    {
                        ans[k++]=-1;
                    }
                }
            }
        }
        return ans;
    }
}

*/

class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map=new HashMap<>();
        Stack<Integer> st=new Stack<>();
        for(int num:nums2)
        {
            while(!st.isEmpty() && st.peek()<num)
            {
                map.put(st.pop(),num);
            }
            st.push(num);
        }
        
        for(int i=0; i<nums1.length; i++)
        {
            nums1[i]=map.getOrDefault(nums1[i],-1);
        }
        return nums1;
    }
}