class Solution {
    public boolean isPalindrome(int x) {
        int temp=x;
        int dig=0;
        int res=0;
        if(temp<0)
            return false;
        while(temp!=0)
        {
            dig=temp%10;
            res=res * 10 + dig;
            temp/=10;
        }
        
        if(x==res)
            return true;
        return false;
    }
}