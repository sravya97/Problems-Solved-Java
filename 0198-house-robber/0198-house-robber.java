class Solution {
    public int rob(int[] nums) {
        int[] dp = new int[nums.length+1];
        if(nums.length == 0){
            return 0;
        }
        dp[0] = 0;
        dp[1] = nums[0];
        for(int i=1;i<nums.length;i++){
            dp[i+1] = Math.max(nums[i] +  dp[i-1], dp[i]);
        }
        return Math.max(dp[nums.length-1], dp[nums.length]);
    }
}