class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        /*
        //beats 100.00%
        if(m==0 && n==0){
            return;
        }
        int [] ans=new int[nums1.length];
        int i=0,j=0,k=0;
        while(m>0 && n>0){
            if(nums1[i] < nums2[j]){
                ans[k++]=nums1[i++];
                m--;
            }
            else
            {
                ans[k++]=nums2[j++];
                n--;
            }
        }
        while(m>0){
            ans[k++]=nums1[i++];
            m--;
        }
        while(n>0){
            ans[k++]=nums2[j++];
            n--;
        }
        for(int z=0;z<ans.length;z++){
            nums1[z]=ans[z];
        }
        */
        
        int p1=m-1,p2=n-1,i=m+n-1;
        while(p2>=0){
            if(p1>=0 && nums1[p1]>nums2[p2]){
                nums1[i--]=nums1[p1--];
            }
            else{
                nums1[i--]=nums2[p2--];
            }
        }
    }
}