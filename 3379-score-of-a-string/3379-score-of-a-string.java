class Solution {
    public int scoreOfString(String s) {
        int score=0;
		char [] arr=s.toCharArray();
		int [] asciiValues=new int[arr.length];
		for(int i=0; i<asciiValues.length; i++) {
			asciiValues[i]=arr[i];
		}
		for(int i=0; i<asciiValues.length-1; i++) {
				int sum=asciiValues[i]-asciiValues[i+1];
				if(sum<0)
					sum=sum* -1;
				score+=sum;		
		}
		return score;


        /*
        char[] st=s.toCharArray();
        int sum=0;
        for(int i=0;i<st.length-1;i++)
        {
            int j=i+1;
            sum=sum+Math.abs(st[i]-st[j]);
        }
        return sum;
         */
    }
}