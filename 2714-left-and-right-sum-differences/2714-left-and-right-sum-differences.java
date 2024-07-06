class Solution {
    public int[] leftRightDifference(int[] nums) {
        int []leftsum=new int[nums.length];
		int []rightsum=new int [nums.length];
		int []ans=new int[nums.length];
		for(int i=1;i<nums.length;i++)
		{
			int sum=0;
			for(int j=i-1;j>=0;j--)
			{
				sum+=nums[j];
			}
			leftsum[i]=sum;			
		}
		for(int i=0;i<nums.length-1;i++)
		{
			int sum=0;
			for(int j=i+1;j<nums.length;j++)
			{
				sum+=nums[j];
			}
			rightsum[i]=sum;			
		}
		for(int i=0;i<ans.length;i++)
		{
			ans[i]=Math.abs(leftsum[i]-rightsum[i]);
		}
		return ans;
    }
}