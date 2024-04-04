class Solution {
    public boolean canJump(int[] nums) {
       int dst = 0;
        for(int i=0;i<nums.length;i++){
            if(dst < i){
                return false;
            } else {
                dst = Math.max(dst, i+nums[i]);
            }
        }
       return true;
    }
}