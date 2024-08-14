class Solution {
    public String mergeAlternately(String word1, String word2) {
       
        char [] arr1=word1.toCharArray();
        char [] arr2=word2.toCharArray();
        StringBuilder res=new StringBuilder();
        int i=0,j=0;
        for(i=0,j=0;i<arr1.length && j<arr2.length;){
            res.append(arr1[i++]);
            res.append(arr2[j++]);
        }
        while(i!=arr1.length)
        {
            res.append(arr1[i++]);
        }
        while(j!=arr2.length)
        {
            res.append(arr2[j++]);
        }
        return String.valueOf(res);
    }
}