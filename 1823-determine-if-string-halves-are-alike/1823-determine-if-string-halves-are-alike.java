class Solution {
    public boolean halvesAreAlike(String s) {
        List<Character> list=new ArrayList<>();
        list.add('a');
        list.add('e');
        list.add('i');
        list.add('o');
        list.add('u');
        list.add('A');
        list.add('E');
        list.add('I');
        list.add('O');
        list.add('U');

        int leftArrCnt=0,rightArrCnt=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(i<s.length()/2 && list.contains(ch)){
                leftArrCnt++;
            }
            else if(i>=s.length()/2 && list.contains(ch))
            {
                rightArrCnt++;
            }
        }

        if(leftArrCnt==rightArrCnt)
            return true;
        return false;
    }
}