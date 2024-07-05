class Solution {
    public int countSeniors(String[] details) {
        int []arr=new int[details.length];
		int i=0;
		for(String s : details)
		{
			char c1=s.charAt(11);
			char c2=s.charAt(12);
			int n1=c1-48;
			int n2=c2-48;
			arr[i++]=(n1*10)+n2;
		}
		int cnt=0;
		for( int j : arr)
		{
			if(j>60)
			    cnt++;
			
		}
		return cnt;
    }
}