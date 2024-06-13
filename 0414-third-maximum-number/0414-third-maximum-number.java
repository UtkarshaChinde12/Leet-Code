class Solution {
    public int thirdMax(int[] nums) {        
            
        //sorting and removing duplicates from array resulting in set of elements
        Set<Integer>set=new TreeSet<>();
        for(int x:nums)
        {
            set.add(x);
        }
        int[] arr=new int[set.size()];

        //creating array from set
        int i=0,result=0,start=0,end=arr.length-1;
        for(int y:set)
        {
            arr[i]=y;
            i++;
        }
       
       //reversing array for easier accessing array elements
        while(start<end)
        {
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        if(arr.length>=3)
            result= arr[2];
        if(arr.length==1)
            result=arr[0];
        if(arr.length==2)
            result=arr[0];
        return result;
        
         
    }
}