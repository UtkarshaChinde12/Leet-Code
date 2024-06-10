class Solution {
   public boolean checkPerfectNumber(int num) {
        int sum=0;
        for(int i=1;i<num;i++){
            //1 + 2 + 4 + 7 + 14
            if(num%i==0)
            {
                sum+=i;
            }
        }
        if(sum==num)
            return true;
        else 
            return false;
    }
}