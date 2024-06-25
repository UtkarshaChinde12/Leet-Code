class Solution {
    public int maxPower(String s) {
        int count=1;
		int maxcount=0;
		
		for(int i=0;i<s.length();i++)
		{
			if(i<s.length()-1 && s.charAt(i)==s.charAt(i+1))
			{
				count++;//if sequence is present then, increment counter
			}
			else {//control comes here indicating substring is over
				if(count>maxcount)
					maxcount=count;//maintain maxcount for particular substring
				count=1;//resetting the count as substring with max length has not found
			}
			
		}
		return maxcount;
    }
}