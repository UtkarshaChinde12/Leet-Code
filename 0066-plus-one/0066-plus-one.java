class Solution {
    public int[] plusOne(int[] digits) {
        /*StringBuilder sb=new StringBuilder();

        for(int i=0;i<digits.length;i++){
            sb.append(digits[i]);
        }
        long num=Long.parseLong(sb.toString());
        
        // System.out.println(num);
        num++;
        // System.out.println
        String str=String.valueOf(num);
        char[] arrChar=str.toCharArray();
        int [] arrInt=new int[arrChar.length];
        for(char i=0;i<arrChar.length;i++)
        {
            arrInt[i]=Character.getNumericValue(arrChar[i]);
        }
        return arrInt;
        */
        for(int i=digits.length-1;i>=0;i--)
        {
            if(digits[i]<9){
                digits[i]++;
                return digits;
            }
            digits[i]=0;
        }
        digits=new int[digits.length+1];
        digits[0]=1;
        return digits;
    }
}