class Solution {
public:
    bool isPowerOfTwo(int n) {
//sol 1
        // return (n>0 && (1073741824%n == 0));


//sol 2
        // for(int i=0; i<=30; i++){
        //     int ans=pow(2,i);

        //     if(ans==n)
        //         return true;
        // }
        // return false;


//sol 3
        int ans=1;

        for(int i=0; i<=30; i++){
            if(n==ans){
                return true;
            }
            if(ans < INT_MAX/2){
                ans= ans * 2;
                // cout<<ans<<endl;
            }
        }
        return false;        
        
    }
};