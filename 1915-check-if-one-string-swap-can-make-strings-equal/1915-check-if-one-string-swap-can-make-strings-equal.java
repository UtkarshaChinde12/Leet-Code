class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        if(s1.equals(s2))
			return true;
		boolean flg1=false,flg2=false;
		int nonEqualPositions=0;
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)!=s2.charAt(i))
				nonEqualPositions++;
		}
		if(nonEqualPositions==0 || nonEqualPositions==2)
			flg1=true;
		
		char[] arr1=s1.toCharArray();
		char[] arr2=s2.toCharArray();
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		if(Arrays.equals(arr1,arr2))
			flg2= true;
		if(flg1 && flg2)
			return true;
		return false;
    }
}