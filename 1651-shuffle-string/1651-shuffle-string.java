class Solution {
    public String restoreString(String s, int[] indices) {
        char[] arr=new char[s.length()];
		arr=s.toCharArray();
		
		Map<Integer,Character> map=new HashMap<Integer, Character>();
		
		for(int i=0;i<arr.length;i++)
		{
			map.put(indices[i],arr[i]);
		}
		char []arr2=new char[map.size()];
		for(int i=0;i<map.size();i++)
		{
			arr2[i]=map.get(i);
		}
		return String.valueOf(arr2);
    }
}