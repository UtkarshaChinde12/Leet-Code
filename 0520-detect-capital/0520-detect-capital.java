class Solution {
    public boolean detectCapitalUse(String word) {
        String temp=word;
        if(temp.toUpperCase()==word)
            return true;
        else if(temp.toLowerCase()==word)
            return true;
        else if(Character.isUpperCase(temp.charAt(0)))
        {
            for(int i=1;i<temp.length();i++){
                if(Character.isUpperCase(temp.charAt(i)))
                    return false;
            }
            return true;
        }
        return false;

    }
}