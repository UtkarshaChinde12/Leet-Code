class Solution {
    public boolean isAcronym(List<String> words, String s) {
        StringBuffer sb=new StringBuffer();
		for( String s1 : words)
		{
			sb.append(s1.charAt(0));
		}
		
		String res=new String(sb);
		return res.equals(s);
    }
}