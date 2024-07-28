class Solution {
    public String interpret(String command) {
        StringBuffer res=new StringBuffer();
		
		for(int i=0;i<command.length();i++)
		{
			if(command.charAt(i)=='G') {
				res.append('G');
			}
			else if(i<command.length()-1 &&  command.charAt(i)=='(' && command.charAt(i+1)==')' ) {
				res.append('o');
			}
			else if(i<command.length()-1 &&  command.charAt(i)=='(' && command.charAt(i+1)=='a') {
				res.append("al");
			}
		}		
		return String.valueOf(res);
    }
}