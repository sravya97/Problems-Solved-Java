class Solution {
    public int maxProfit(int[] prices) {
        int max = Integer.MIN_VALUE;
        int profit = 0;
        int buy = Integer.MAX_VALUE;
        for(int i=0;i<prices.length;i++){
            if(buy > prices[i]){
                buy = prices[i];
            }
            if(prices[i]-buy > 0){
                profit += prices[i]-buy;
                buy = prices[i];
            }
        }
        return profit;
    }
}