class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1 );
        }
        
        

        Map<Integer, Integer> sortedMap = map.entrySet()
                .stream()
                .sorted(Map.Entry.<Integer, Integer>comparingByValue().reversed())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1, e2) -> e1,
                        LinkedHashMap::new
                ));
        int[] result = new int[k];
        int j = 0;
        System.out.println(sortedMap);
        for(Map.Entry<Integer, Integer> itr : sortedMap.entrySet()){
            if(j==k){
                break;
            }
            result[j++] = itr.getKey(); 
        }
        return result;
    }
}