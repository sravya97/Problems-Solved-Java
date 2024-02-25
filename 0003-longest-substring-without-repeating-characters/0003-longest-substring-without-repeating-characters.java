class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        Set<Character> set = new HashSet<>();
        int start = 0;
        int maxLength = 0;
        int length = 0;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(set.contains(ch)){
                while(set.contains(ch)){
                    set.remove(s.charAt(start));
                    start++;
                }
                set.add(ch);
                length = i-start+1;
            } else{
                set.add(ch);
                length++;
            } 
            maxLength = Math.max(maxLength, length);
        }
        return maxLength;
        
    }
}