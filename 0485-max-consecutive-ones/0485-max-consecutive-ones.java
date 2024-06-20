class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
       int one=1,none=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==1)
            {
                if(i<nums.length-1 && nums[i]==1 && nums[i+1]==1)
                    one++;
                else
                {
                    if(one>none)
                        none=one;
                    one=1;
                }
            }
        }
        return none;
    }
}