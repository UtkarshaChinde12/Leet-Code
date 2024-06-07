class Solution {
    public int lengthOfLastWord(String s) {
        //removing all leading and trailing spaces
        s.trim();

        //splitting the string using split and regex as \\s+
        //   \\s-->implies all spaces, tabs and \n
        //     + --> implies one or more occurances
        //split returns array of strings
        String[] arr=s.split("\\s+");

        //last string of array==last word
        String maxlength=arr[arr.length-1];//length of last word
        return maxlength.length();
    }
}

