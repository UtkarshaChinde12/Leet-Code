class Solution {
    public int longestConsecutive(int[] nums) {
            if(nums.length==0)
	            return 0;
	        Set<Integer>set=new TreeSet<Integer>();//to remove duplicates as duplicates cannot come in consecutive sequence
	        for(int x:nums)
	        {
	            set.add(x);
	        }
	        int[] arr=new int[set.size()];
	        int k=0;
	        for(int j:set)
	        {
	            arr[k]=j;
	            k++;
	        }
            
	        int maxcount=0,count=0;
	        for(int i=0;i<arr.length-1;i++)
	        {
	            if(arr[i+1]-arr[i]==1)
	                count++;
	            if(count>maxcount)
	                    maxcount=count;
	            {
	               	if(arr[i+1]-arr[i]!=1)

	                count=0;
	            }
	         
	        }
	        return maxcount+1;
            //maxcount+1 is done cuz maxcount has number of paris of elements in consecutive sequence and we need number of elements so +1
    }
}