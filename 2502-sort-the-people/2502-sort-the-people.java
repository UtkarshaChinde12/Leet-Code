class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        Map<Integer, String> map=new TreeMap<Integer, String>();
		String []result=new String[names.length];
		for(int i=0;i<heights.length;i++)
		{
			map.put(heights[i],names[i]);
		}
		int i=0;
		for(Map.Entry<Integer,String> entry : map.entrySet())
		{			
			result[i++]=entry.getValue();
		}
		int j=0;
		for( i=0,j=result.length-1;i<j;i++,j--)
		{
			String temp=result[i];
			result[i]=result[j];
			result[j]=temp;
		}
		
		return result;
    }
}