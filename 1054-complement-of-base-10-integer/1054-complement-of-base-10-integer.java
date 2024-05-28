class Solution {
    public int bitwiseComplement(int n) {
        int m=n;


        if(n==0){              //edge case when n is 0 (zero)
            return 1;
        }

        int mask=0;
        while(m!=0){
            mask= (mask<<1) + 1;
            m=m>>1;
        }
         
        int ans=0;
        ans= (~n) & mask;
        return ans;
    }
}
