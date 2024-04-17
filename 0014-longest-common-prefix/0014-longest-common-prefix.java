class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String first = strs[0];
        String last = strs[strs.length-1];
        int pointer = 0;
        while(pointer < first.length() && first.charAt(pointer)==last.charAt(pointer)){
            pointer++;
        }
        return first.substring(0, pointer);
    }
}