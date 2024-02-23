class Solution {
    public int combinationSum4(int[] nums, int target) {
        int[] dp = new int[target+1];
        Arrays.fill(dp, -1);
        dp[0] = 0;
        return count(nums, target, dp);
        
    }
    
    int count(int[] nums, int target, int[] dp){
        if(target == 0){
            return 1;
        }
        if(target < 0){
            return 0;
        }

        if(dp[target] != -1){
            return dp[target];
        }
        int ways = 0;
        for(int i=0;i<nums.length;i++){
            int ret = count(nums, target - nums[i], dp);
            ways = ways + ret ;
        }
        dp[target] = ways;
        return dp[target];
    }
}