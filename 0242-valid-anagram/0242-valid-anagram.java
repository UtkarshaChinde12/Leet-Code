class Solution {
    public boolean isAnagram(String s, String t) {
        
        char [] sa=s.toCharArray();
        Arrays.sort(sa);
        char [] ta=t.toCharArray();
        Arrays.sort(ta);
        s=String.valueOf(sa);
        t=String.valueOf(ta);
        System.out.println("s:"+s);
        System.out.println("t:"+t);
        if(s.equals(t))
            return true;
        else 
            return false;
        
    }
}