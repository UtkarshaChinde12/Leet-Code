import java.util.LinkedHashSet;
import java.util.Set;
class Solution {
    public int removeDuplicates(int[] nums) {
        //using linked hash set to preserve the order
		Set<Integer> myset=new LinkedHashSet<Integer>();
		for(int i : nums)
		{
			myset.add(i);
		}
		int cnt=0,i=0;
		Arrays.fill(nums, 0);//for changing the nums array
		for(int j : myset)
		{
			cnt++;
			nums[i]=j;
			i++;
		}
		return cnt;
	}
}