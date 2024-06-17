import java.util.*;
class Solution {
    public int romanToInt(String s) {

		Map<Character, Integer> map=new HashMap<Character, Integer>();
		map.put('I',1);
		map.put('V',5);
		map.put('X',10);
		map.put('L',50);
		map.put('C',100);
		map.put('D',500);
		map.put('M',1000);
		
		int result=0;
		for(int i=0;i<s.length();i++)
		{
			//if the curr char is less than the next char then we have to subtract the curr char from the next char, as we have don't have access to next char but had stored previous values in result variable then we can subtract from the result, eventually subtraction is going to be done
			if(i<s.length()-1 && map.get(s.charAt(i)) < map.get(s.charAt(i+1)))
			{				
				result=result-map.get(s.charAt(i));
			}
			//if the char is greater means we have to add the char's value to our final result 
			else
				result=result+ map.get(s.charAt(i));
		}
		return result;
	}
}