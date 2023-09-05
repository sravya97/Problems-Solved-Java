class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        // O(n) Time and O(n) extra space for map
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int remaining = target - nums[i];
            if(map.containsKey(remaining)){
                return new int[] { map.get(remaining), i };
            } else {
                map.put(nums[i], i);
            }
        }
        return null;
    }
}