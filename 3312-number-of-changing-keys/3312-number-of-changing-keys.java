class Solution {
    public int countKeyChanges(String s) {
        if(s.length()==1)
		{
			return 0;
		}
		s=s.toLowerCase();
		int cnt=0;
		for(int i=0;i<s.length();i++)
		{
			if(i<s.length()-1 && s.charAt(i)!=s.charAt(i+1))
				cnt++;
		}
		return cnt;
    }
}