public class bestTimeToBuyAndSellStocks {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int dp[] = new int[n+1];
        int globalMax = 0;
        dp[0] = 0;
        for(int i = 1; i<n+1; i++){
            for(int j = i+1; j<n+1; j++){
                dp[i] = Math.max(dp[i],prices[j-1]-prices[i-1]);
            }
            globalMax = Math.max(dp[i],globalMax);
        }
        return globalMax;

    }
}
