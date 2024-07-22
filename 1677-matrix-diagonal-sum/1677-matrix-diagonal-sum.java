class Solution {
    public int diagonalSum(int[][] mat) {
        int sum=0;
		int n=mat.length;
		int midEle=n/2;
		
		for(int i=0;i<mat.length;i++)
		{
			sum+=mat[i][i];
			sum+=mat[i][n-i-1];
		}
		if(n%2==1)
			sum-=mat[midEle][midEle];
		return sum;
    }
}