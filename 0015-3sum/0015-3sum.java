class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int first;
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(i > 0 && nums[i]==nums[i-1]){
                continue;
            }
            first = nums[i];
            int start = i+ 1;
            int end = nums.length-1;
            while(start < end){
                int sum = first + nums[start] + nums[end];
                if(sum == 0){
                    int[] vals = new int[]{i, start, end};
                    result.add(Arrays.asList(first, nums[start], nums[end]));
                    while(start < end && nums[start]==nums[start+1]){
                        start++;
                    }
                    while(start < end && nums[end]==nums[end-1]){
                        end--;
                    }
                    start++;
                    end--;
                } else {
                    if(sum < 0){
                        start ++;
                    } else {
                        end --;
                    }
                }
            }
        }
        return result;
        
    }
}