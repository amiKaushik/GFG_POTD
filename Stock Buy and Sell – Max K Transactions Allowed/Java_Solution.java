class Java_Solution {
    static int maxProfit(int prices[], int k) {
        if(prices.length==0 || k==0) return 0;
        int n = prices.length;
        if(k>= n/2){
            int maxProfit = 0;
            for(int i=1;i<n;i++){
                if(prices[i]>prices[i-1]){
                    maxProfit += prices[i] - prices[i-1];
                }
            }
            return maxProfit;
        }
        int[][] dp = new int[k+1][n];
        for(int t=1;t<=k;t++){
            int maxDiff = -prices[0];
            for(int d=1;d<n;d++){
                dp[t][d] = Math.max(dp[t][d - 1], prices[d] + maxDiff);
                maxDiff = Math.max(maxDiff, dp[t - 1][d] - prices[d]);
            }
        }
        return dp[k][n - 1];
    }
}
