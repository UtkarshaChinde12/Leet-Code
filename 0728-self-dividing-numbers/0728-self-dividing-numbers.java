class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> res=new ArrayList<Integer>();
		
		for(int i=left; i<=right; i++)
		{
			int dig=0;
			int no=i;
			boolean flg=true;
			while(no>0)
			{
				dig=no%10;
				if(dig==0) {
					flg=false;
					break;
				}
					
				if(i%dig!=0) {
					flg=false;
					break;
				}
				
				no/=10;
			}
			if(flg)
				res.add(i);
		}
		return res;
    }
}