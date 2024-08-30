class Solution {
    public int findPermutationDifference(String s, String t) {
        int [] hashtable=new int[26];
		for(int i=0;i<s.length();i++) {

			char ch=s.charAt(i);
			int index=ch-'0'-'0'-1;
			hashtable[index]=1;
		}
		int sum=0;
		for(int j=0;j<t.length();j++) {
			char c=t.charAt(j);
			int tIndex=c-'0'-'0'-1;
			if(hashtable[tIndex]==1) {
				int absDiff=Math.abs(j-s.indexOf(c));
				sum+=absDiff;
			}			
		}		
		return sum;
    }
}