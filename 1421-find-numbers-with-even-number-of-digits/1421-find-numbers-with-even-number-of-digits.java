class Solution {
    public int findNumbers(int[] nums) {
        int rescnt=0;
		for(int i=0;i<nums.length;i++)
		{
			int no=nums[i];
			int cnt=0;
			while(no>0) {
				cnt++;
				no/=10;
			}
			if(cnt%2==0)
			{
				rescnt++;
			}			
		}
		return rescnt;
    }
}