class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int []res=new int[nums.length];
		for(int i=0;i<nums.length;i++)
		{
			int mincnt=0;
			for(int j=0;j<nums.length;j++)
			{
				if(nums[j]<nums[i])
				{
					mincnt++;
				}
			}
			res[i]=mincnt;
		}
		return res;
    }
}