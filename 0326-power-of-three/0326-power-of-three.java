class Solution {
    public boolean isPowerOfThree(int n) {
        double res=0;
        for(int i=0;i<30;i++)
        {
            res=Math.pow(3,i);
            if(res==n)
            {
                return true;
            }
        }
        return false;
    }
}