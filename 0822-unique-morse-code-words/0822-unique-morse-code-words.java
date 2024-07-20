class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        Map<Character, String> map = new HashMap<Character, String>();

		map.put('a', ".-");
		map.put('b', "-...");
		map.put('c', "-.-.");
		map.put('d', "-..");
		map.put('e', ".");

		map.put('f', "..-.");
		map.put('g', "--.");
		map.put('h', "....");
		map.put('i', "..");
		map.put('j', ".---");

		map.put('k', "-.-");
		map.put('l', ".-..");
		map.put('m', "--");
		map.put('n', "-.");
		map.put('o', "---");

		map.put('p', ".--.");
		map.put('q', "--.-");
		map.put('r', ".-.");
		map.put('s', "...");
		map.put('t', "-");

		map.put('u', "..-");
		map.put('v', "...-");
		map.put('w', ".--");
		map.put('x', "-..-");
		map.put('y', "-.--");

		map.put('z', "--..");

		Set<String> set=new HashSet<String>();
		//set<StringBuffer> will not remove duplicates as StringBuffer class does not override equals and hashcode method from object class to detect whether the strings are equal or not but String class does so Set<String> is used
		for(int i=0;i<words.length;i++)
		{
			StringBuffer sb=new StringBuffer();
			for(int j=0;j<words[i].length();j++)
			{
				sb.append(map.get(words[i].charAt(j)) );
//				System.out.println("i:"+i+" j:"+j+" sb:"+sb);
				
			}
			set.add(new String(sb));
		}
		return set.size();
    }
}