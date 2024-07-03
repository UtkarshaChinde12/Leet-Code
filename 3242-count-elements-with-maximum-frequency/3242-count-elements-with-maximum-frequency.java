class Solution {
    public int maxFrequencyElements(int[] nums) {
        Map<Integer,Integer> map=new TreeMap<Integer, Integer>();
		for(int i=0;i<nums.length;i++)
		{
			map.put(nums[i], map.getOrDefault(nums[i],0)+1);
		}
		int sum=0,max=0;
		for(Map.Entry<Integer,Integer> entry : map.entrySet())
		{
			System.out.println("Key: "+entry.getKey()+ " value: "+ entry.getValue()); 
			if(entry.getValue()>max) 
			{
				max=entry.getValue();
			}
		}
		
		for(Map.Entry<Integer,Integer> entry : map.entrySet())
		{
			if(entry.getValue()==max)
			{
				sum=sum+max;
			}
		}
		return sum;
    }
}