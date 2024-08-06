class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder sb1=new StringBuilder();
        StringBuilder sb2=new StringBuilder();
        int i=0,j=0;
        while(i<word1.length)
        {
            sb1.append(word1[i++]);
        }
        while(j<word2.length){
            sb2.append(word2[j++]);
        }
        if(String.valueOf(sb1).equals(String.valueOf(sb2)))
        {
            return true;
        }
        return false;
        
    }
}