class Solution {

    public int removeDuplicates(int[] nums) {
        int length = nums.length;
        if(length < 1){
            return length;
        }
        int position = 1;
        int previous = nums[0];
        for(int i=1; i < nums.length; i++){
            if(previous == nums[i]){
                continue;
            } else {
                // Encountered unique element.
                previous = nums[i];
                nums[position++] = nums[i];
            }
        }
        return position;
    }
}