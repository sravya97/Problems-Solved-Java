class Solution {
    public int[] getConcatenation(int[] nums) {
        int inputLength = nums.length;
        int[] result = new int[2 * inputLength];
        for(int i=0; i<inputLength; i++){
            result[i] = nums[i];
            result[i + inputLength] = nums[i];
        }
        return result;
    }
}