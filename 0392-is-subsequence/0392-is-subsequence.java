class Solution {
    public boolean isSubsequence(String s, String t) {
        if(t.length()<s.length()){
            return false;
        }
        int start1 = 0;
        int start2 = 0;
        while(start1 < s.length() && start2 < t.length()){
            if(s.charAt(start1) != t.charAt(start2)){
                start2++;
            } else{
                start1++;
                start2++;
            }
        }
        if(start1 == s.length()){
            return true;
        } else {
            return false;
        }
    }
}