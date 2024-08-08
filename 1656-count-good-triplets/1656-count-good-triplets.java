class Solution {
    public int countGoodTriplets(int[] arr, int a, int b, int c) {
        int n=arr.length;
		int cnt=0;
		for(int i=0;i<n;) {
			for(int j=i+1;j<n;) {
				for(int k=j+1;k<n;) {
					if(i<j && j<k)
					{
						if(Math.abs(arr[i]-arr[j])<=a) {
							if(Math.abs(arr[j]-arr[k])<=b) {
								if(Math.abs(arr[i]-arr[k])<=c) {
									cnt++;
								}
							}
						}
					}
					k++;
				}
				j++;
			}
			i++;	
			
		}
		return cnt;
    }
}