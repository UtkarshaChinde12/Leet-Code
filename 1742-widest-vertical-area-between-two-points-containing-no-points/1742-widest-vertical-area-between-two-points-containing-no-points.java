class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
        int []arr=new int[points.length];
        for(int i=0;i<points.length;i++)
        {
            arr[i]=points[i][0];
        }
        Arrays.sort(arr);
        int maxWidth=0;
        for(int i=0;i<arr.length-1;i++)
        {
            int width=Math.abs(arr[i]-arr[i+1]);
            if(width>maxWidth)
            {
                maxWidth=width;
            }
        }
        return maxWidth;

    }
}