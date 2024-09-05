class Solution {
    public int maximumWealth(int[][] accounts) {
        int richestWealth=0;
		for(int i=0;i<accounts.length;i++) {
			int customerWealth=0;
			for(int j=0;j<accounts[i].length;j++) {
				customerWealth+=accounts[i][j];
			}
			if(customerWealth>richestWealth) {
				richestWealth=customerWealth;
			}
		}
		return richestWealth;
    }
}