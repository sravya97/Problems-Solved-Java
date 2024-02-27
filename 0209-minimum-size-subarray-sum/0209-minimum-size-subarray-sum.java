class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        
        int min = Integer.MAX_VALUE;
        int sum = 0;
        int start = 0;
        for(int i=0;i<nums.length;i++){
            sum += nums[i];

            if(sum >= target){
                min = Math.min(min, i-start+1);
            }
            while(sum>=target){
                min = Math.min(min, i-start+1);
                sum -= nums[start];
                start++;
            }

        }
        return min != Integer.MAX_VALUE? min : 0;
        
    }
}