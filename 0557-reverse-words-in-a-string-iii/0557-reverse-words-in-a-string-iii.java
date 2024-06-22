class Solution {
    public String reverseWords(String s) {
        String[] arr = new String[s.length()];
		arr = s.split("\\s+");

		String resultString = new String();
		for (int i = 0; i < arr.length; i++) {
			StringBuilder sb = new StringBuilder(arr[i]);
			StringBuilder rev = sb.reverse();
			resultString += rev;
			if(i!=arr.length-1)
				resultString += " ";
		}

		return resultString;
    }
}