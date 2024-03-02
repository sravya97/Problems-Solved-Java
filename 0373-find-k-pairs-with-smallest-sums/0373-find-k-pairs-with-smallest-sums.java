class Solution {
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        PriorityQueue<int[]> queue = new PriorityQueue<>((int[] a, int[] b) -> a[0] - b[0]);
        for(int i=0;i<nums1.length;i++){
            queue.offer(new int[]{nums1[i]+ nums2[0], i, 0});
        }
        List<List<Integer>> result = new ArrayList<>();
        while(k > 0){
            List<Integer> list = new ArrayList<>();
            int[] min = queue.poll();
            list.add(nums1[min[1]]);
            list.add(nums2[min[2]]);
            result.add(list);
            k--;
            if(min[2] + 1 < nums2.length){
                queue.offer(new int[]{nums1[min[1]] + nums2[min[2]+1], min[1], min[2]+1});
            }
        }
        return result;
        
    }
}