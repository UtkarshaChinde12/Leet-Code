class Solution {
    public String capitalizeTitle(String title) {
        String temp=title.toLowerCase();
		String []arr=temp.split("\\s+");//split occurs at spaces
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i].length()<=2)
				continue;
			char [] ar=arr[i].toCharArray();
			char ch=Character.toUpperCase(ar[0]);
			ar[0]=ch;
			//converting the char [] back to string
			arr[i]=String.valueOf(ar);
		}
		//joining the string [] into single String
		return String.join(" ", arr);
    }
}