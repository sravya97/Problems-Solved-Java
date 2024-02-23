class Solution {
    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, -1);
        int ret = countCoins(coins, amount, dp);
        return ret == Integer.MAX_VALUE ? -1 : ret;
    }
    
    public int countCoins(int[] coins, int amount, int[] dp){
        if(amount == 0){
            return 0;
        }
        if(amount < 0){
            return Integer.MAX_VALUE;
        }
        if(dp[amount]!= -1){
            return dp[amount];
        }
        int count = Integer.MAX_VALUE;
        for(int i=0;i<coins.length;i++){
            int ret = countCoins(coins, amount-coins[i], dp);
            if(ret != Integer.MAX_VALUE){
                count = Math.min(count, ret + 1);
            }
        }
        dp[amount] = count;
        return dp[amount];
    }
}