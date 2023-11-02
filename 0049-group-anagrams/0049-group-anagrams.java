class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for(int i=0; i<strs.length; i++){
            char charArray[] = strs[i].toCharArray();
            Arrays.sort(charArray);
            String key = String.valueOf(charArray);
            List<String> list = map.getOrDefault(key, new ArrayList<>());
            list.add(strs[i]);
            map.put(key, list);
        }
        List<List<String>> result = new ArrayList<>();
        for(Map.Entry<String, List<String>> itr : map.entrySet()){
            result.add(itr.getValue());
        }
        return result;
    }
}