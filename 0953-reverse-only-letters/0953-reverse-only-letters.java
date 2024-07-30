class Solution {
    public String reverseOnlyLetters(String s) {
        int i=0;
		int j=s.length()-1;
		char []arr=s.toCharArray();
		while(i<=j) {
			if(Character.isLetter(arr[i]) && Character.isLetter(arr[j])) {
				char ch=arr[i];
				arr[i]=arr[j];
				arr[j]=ch;
				i++;
				j--;
			}
			else if(Character.isLetter(arr[i]) && !(Character.isLetter(arr[j]))) {
				j--;
			}
			else if(!(Character.isLetter(arr[i])) && Character.isLetter(arr[j])) {
				i++;
			}
			else if(!(Character.isLetter(arr[i])) && !(Character.isLetter(arr[j]))) {
				i++;
				j--;
			}			
		}		
		return String.valueOf(arr);
    }
}